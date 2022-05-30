package com.davsoncze;

import java.text.DecimalFormat;

public class WageCalculator {
    private static double pHealthInsurance = 4.5; //procenta pro výpočet zdrav. pojištění
    private static double pSocialInsurance = 6;
    private static double[] pTaxes = {15, 20};
    private static double taxLimitingValue = 30000; //20000 pro úkol 4
    private static DecimalFormat df2 = new DecimalFormat("0.00");

    public static double calculateHealthInsurance(Person person)
    {
        double healthInsurance = Math.round(person.getGrossWage() * pHealthInsurance) / 100.0;
        System.out.println("    Zdravotní pojištění: " + df2.format(healthInsurance) + " Kč");
        return healthInsurance;
    }

    public static double calculateSocialInsurance(Person person)
    {
        double socialInsurance = 0;
        if (person.getPersonType() == PersonType.EMPLOYEE)
        {
            socialInsurance = Math.round(person.getGrossWage() * pSocialInsurance) / 100.0;
        }
        System.out.println("    Sociální pojištění: " + df2.format(socialInsurance) + " Kč");
        return socialInsurance;
    }

    public static double calculateTaxes(Person person)
    {
        double tax = 0;
        if (person.getGrossWage() < taxLimitingValue)
        {
            tax = Math.round(person.getGrossWage() * pTaxes[0]) / 100.0;
        }
        else
        {
            tax = Math.round(person.getGrossWage() * pTaxes[1]) / 100.0;
        }
        System.out.println("    Daň z příjmu: " + df2.format(tax) + " Kč");
        return tax;
    }

    public static void calculateToPay(Person person, double currentWages)
    {
        person.setToPay(person.getGrossWage() - person.getPaidOut() - currentWages);
        System.out.println("    Již vyplaceno: " + df2.format(person.getPaidOut()) + " Kč");
        System.out.println("    Zbývá k vyplacení: " + df2.format(person.getToPay()) + " Kč");
    }

    public static void calculateAll(Person person) //kompaktní metoda
    {
        System.out.println("****************************************************************************************************");
        person.printInfo();
        System.out.println("Hrubá mzda: " + df2.format(person.getGrossWage()) + " Kč");
        double wages = calculateHealthInsurance(person) + calculateSocialInsurance(person) + calculateTaxes(person);
        System.out.println("    Celková daň: " + df2.format(wages) + " Kč");
        calculateToPay(person, wages);
        System.out.println("****************************************************************************************************");
    }
}
