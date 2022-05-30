package com.davson;

public class OperationUK1 {

   /* public static int CalculateNumbers(int a1, int b2){
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
    }*/

    public static int Signum(double number){
        if(number<0) return -1;
        else if(number==0) return 0;
        else return 1;
    }

    public static double[] AverageOfArray(double[] inputArray){
        double sum= 0;
        double avg;
        double[] outputArray = new double[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        avg = sum/inputArray.length;

        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] - avg;
        }
        return outputArray;
    }

    public static int FibonacciNumber(int N){
        if(N < 1) throw new IllegalArgumentException("Numbers must be bigger than 1!");

            int[] fibArray = new int[N];
            fibArray[0] = fibArray[1] = 1;

            for (int i = 2; i < N; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }
        return fibArray[N-1];
    }

    public static double[] QuadraticEquation(int a, int b, int c){
        double d= b*b - 4*a*c;
        double[] result = new double[2];
        if(d < 0) {
            result[0] = Integer.MIN_VALUE;
            result[1] = Integer.MIN_VALUE;
        }
        else if(d > 0) {
            result[0] = (-b + Math.sqrt(d)) /(2*a);
            result[1] = (-b - Math.sqrt(d)) /(2*a);
        }
        else {
            result[0] = result[1] = -b/(2*a);
        }

        return result;
    }
}
