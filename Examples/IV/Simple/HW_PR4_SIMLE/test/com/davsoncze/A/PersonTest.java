package com.davsoncze.A;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void TestSplitTelNumber(){
        Person p1 = new Person("David","Slonka", 35,"733254122");
        String actualValue = p1.splitNumber();
        String exceptionValue = "733 254 122";
        assertEquals(exceptionValue, actualValue);
    }
    @Test
    public void TestChar(){
        String name = "David";
        Boolean actualValue = Person.checkCharacter(name,"a");
        Boolean exceptionValue = true;
        assertEquals(exceptionValue, actualValue);
    }
}