package com.davsoncze;

public class Person {
    private String name;
    private PersonType personType;
    private double grossWage;
    private double paidOut;
    private double toPay;

    public Person(String name, PersonType personType, double grossWage, double paidOut) {
        this.name = name;
        this.personType = personType;
        this.grossWage = grossWage;
        this.paidOut = paidOut;
        this.toPay = -1; //chybová hodnota pro nevypočtenou mzdu
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PersonType getPersonType() {
        return personType;
    }
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public double getGrossWage() {
        return grossWage;
    }
    public void setGrossWage(double grossWage) {
        this.grossWage = grossWage;
    }

    public double getPaidOut() {
        return paidOut;
    }
    public void setPaidOut(double paidOut) {
        this.paidOut = paidOut;
    }

    public double getToPay() {
        return toPay;
    }
    public void setToPay(double toPay) {
        this.toPay = toPay;
    }

    public void printInfo()
    {
        System.out.println("Jméno: " + name);
        System.out.print("Student: ");
        if (personType == PersonType.STUDENT)
            System.out.println("Ano");
        else
            System.out.println("Ne");
    }
}
