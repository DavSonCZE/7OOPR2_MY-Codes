package com.davsoncze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WageCalculatorTest {

    @Test
    void calculateHealthInsurance() {
        Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, 54321, 0 );
        double expectedHealthInsurance = 2444.45;
        double actualHealthInsurance = WageCalculator.calculateHealthInsurance(p1);
        assertEquals(expectedHealthInsurance, actualHealthInsurance);
    }

    @Test
    void calculateSocialInsurance() {
        Person p1 = new Person("David Slanina", PersonType.STUDENT, 54321, 0 );
        double expectedSocialInsurance = 0;
        double actualSocialInsurance = WageCalculator.calculateSocialInsurance(p1);
        assertEquals(expectedSocialInsurance, actualSocialInsurance);
    }

    @Test
    void calculateSocialInsurance2() {
        Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, 54321, 0 );
        double expectedSocialInsurance = 3259.26;
        double actualSocialInsurance = WageCalculator.calculateSocialInsurance(p1);
        assertEquals(expectedSocialInsurance, actualSocialInsurance);
    }

    @Test
    void calculateTaxes() {
        Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, 54321, 0 );
        double expectedTaxes = 10864.2;
        double actualTaxes = WageCalculator.calculateTaxes(p1);
        assertEquals(expectedTaxes, actualTaxes);
    }

    @Test
    void calculateTaxes2() {
        Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, 19999, 0 );
        double expectedTaxes = 2999.85;
        double actualTaxes = WageCalculator.calculateTaxes(p1);
        assertEquals(expectedTaxes, actualTaxes);
    }

    @Test
    void calculateToPay() {
        Person p1 = new Person("David Slanina", PersonType.STUDENT, 20000, 10000 );
        assertEquals(p1.getToPay(), -1); //zda vyplaceni neni nastaveno
    }

    @Test
    void testSum() {
        double expectedGrossWage = 54321.54;
        Person p1 = new Person("David Slanina", PersonType.EMPLOYEE, expectedGrossWage, 0 );
        double wages = WageCalculator.calculateHealthInsurance(p1) + WageCalculator.calculateSocialInsurance(p1)
                + WageCalculator.calculateTaxes(p1);
        WageCalculator.calculateAll(p1); //nastavi i mnozstvi penez k vyplaceni
        assertEquals(expectedGrossWage, p1.getToPay()+wages); //zda hrubá mzda = mzda k vyplaceni + celková daň
    }
}