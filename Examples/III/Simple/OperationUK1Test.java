package com.davson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationUK1Test{

    @Test
    void SuccessfulCalculateTwoNumbers(){
        int a1=15;
        int a2=20;
        int actualValue = OperationUK1.CalculateNumbers(a1,a2);
        int exceptionValue = 35;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void FailCalculateTwoNumbers(){
        int a1=15;
        int a2=20;
        int actualValue = OperationUK1.CalculateNumbers(a1,a2);
        int exceptionValue = 30;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void SuccessfulCalculatePythagorean(){
        int b1=25;
        int b2=30;
        double actualValue = OperationUK1.CalculatePythagorean(b1,b2);
        double exceptionValue = 39;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void FailCalculatePythagorean(){
        int b1=25;
        int b2=30;
        double actualValue = OperationUK1.CalculatePythagorean(b1,b2);
        double exceptionValue = 60;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void PositiveCounteOfNumbers(){
        int[] pole= {1,-2,3,4,5,2,69};
        double actualValue = OperationUK1.CountPositive(pole);
        double exceptionValue=6;
        assertEquals(exceptionValue, actualValue);
    }
    @Test
    void FailCounteOfNumbers(){
        int[] pole= {1,-2,3,4,5,2,69};
        double actualValue = OperationUK1.CountPositive(pole);
        double exceptionValue=7;
        assertEquals(exceptionValue, actualValue);
    }

}