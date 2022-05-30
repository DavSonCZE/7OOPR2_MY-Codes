package com.davsoncze;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
            var df2 = new DecimalFormat("0.00");
            //Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, 50000, 0 );
            Person p1 = new Person("David Slanina",PersonType.EMPLOYEE,5000,0);

            System.out.println("****************************************************************************************************");
            p1.printInfo();
            System.out.println("Hrubá mzda: " + df2.format(p1.getGrossWage()) + " Kč");
            double currentWages = WageCalculator.calculateHealthInsurance(p1);
            currentWages += WageCalculator.calculateSocialInsurance(p1);
            currentWages += WageCalculator.calculateTaxes(p1);
            System.out.println("    Celková daň: " + df2.format(currentWages) + " Kč");
            WageCalculator.calculateToPay(p1, currentWages);
            System.out.println("****************************************************************************************************");
            Person p2 = new Person("David Slunina", PersonType.STUDENT, 54321, 20000 );
            WageCalculator.calculateAll(p2);
    }
}
