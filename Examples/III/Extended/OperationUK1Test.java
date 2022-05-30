package com.davson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationUK1Test{

  /*  @Test
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
    }*/

    @Test
    void SignumVariantNegative() {
        double actualValue = OperationUK1.Signum(-69);
        double exceptionValue = -1;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void SignumVariantZero() {
        double actualValue = OperationUK1.Signum(0);
        double exceptionValue = 0;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void SignumVariantPossitive() {
        double actualValue = OperationUK1.Signum(69);
        double exceptionValue = 1;
        assertEquals(exceptionValue, actualValue);
    }

    @Test
    void AverageOfArray() {
        double[] inputArray = {10,5,8,3,1,4,-6,15};
        double[] actualValue = OperationUK1.AverageOfArray(inputArray);
        double[] exceptionValue = {5,0,3,-2,-4,-1,-11,10};
        assertArrayEquals(exceptionValue, actualValue);
    }

    @Test
    void FibonacciNumber(){
        int actualValue = OperationUK1.FibonacciNumber(16);
        int expectedValue = 987;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void QuadraticEquation0solution(){
        double[] actualValue = OperationUK1.QuadraticEquation(-4,-4,-4);
        double[] expectedValue = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        assertArrayEquals(expectedValue, actualValue);
    }
    @Test
    void QuadraticEquation1solution(){
       double[] actualValue = OperationUK1.QuadraticEquation(1,2,1);
        double[] expectedValue = {-1,-1};
        assertArrayEquals(expectedValue, actualValue);
    }
    @Test
    void QuadraticEquation2solution(){
        double[] actualValue = OperationUK1.QuadraticEquation(4,11,-3);
        double[] expectedValue = {0.25,-3};
        assertArrayEquals(expectedValue, actualValue);
    }
}