package com.davson;

public class OperationUK1 {

    public static int CalculateNumbers(int a1, int b2){
        int out= a1 + b2;
        return out;
    }

    public static double CalculatePythagorean(int b1, int b2) {
        double calc = Math.sqrt((Math.pow(b1,2) + Math.pow(b2,2)));
        return calc;
    }

    public static int CountPositive(int[] pole) {
        int count = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > 0) {
            count++;
            }
        }

        return count;
    }

}
