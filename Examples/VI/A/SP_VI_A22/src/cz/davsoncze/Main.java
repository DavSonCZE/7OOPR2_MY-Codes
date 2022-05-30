package cz.davsoncze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Samostatný příklad VI A - simple
        List<Float> numbers = method6A_generateArray();
        method6A_countAllPositiveNumbers(numbers);
        method6A_countAllNegativeNumbers(numbers);
        //Samostatný příklad VI A - extended

        final int size = 800;
        int[] array = method6Ae_generateArray(size);
        int[][] array2 = new int[2][];
        array2[0] =  method6Ae_makePositiveArray(array);
        array2[1] =  method6Ae_makeNegativeArray(array);

        System.out.println("Původní pole:");
        method6Ae_calculateStatistics(array);
        System.out.println("Kladné pole:");
        method6Ae_calculateStatistics(array2[0]);
        System.out.println("Záporné pole:");
        method6Ae_calculateStatistics(array2[1]);

   }

    private static List<Float> method6A_generateArray(){
        List<Float> numbers = new ArrayList<Float>();
        Random rnd = new Random();
        for(int i=0; i < 100;i++){
            numbers.add(rnd.nextFloat(2000)-1000);
            //System.out.println(numbers.get(i));
        }
        return numbers;
    }

    private static void method6A_countAllPositiveNumbers(List<Float> numbers){
        float total = 0f;
        int count = 0;
        for(float num : numbers) {
            if (num > 0) {
                total += num;
                count++;
            }
        }

        System.out.println("Průměr kladných čísel je: " + total/count);
    }
    private static void method6A_countAllNegativeNumbers(List<Float> numbers){
        float total = 0f;
        int count = 0;
        for(float num : numbers) {
            if (num < 0) {
                total += num;
                count++;
            }
        }

        System.out.println("Průměr záporných čísel je: " + total/count);
    }

    private static int[] method6Ae_generateArray(int size) {
        int[] array = new int[size];
        Random rnd = new Random();
        for(int i=0; i < size;i++){
            array[i] = rnd.nextInt((int)2e6)-(int)1e6;
            //System.out.println(array[i]);
        }
        return array;
    }

    private static int[] method6Ae_makePositiveArray(int[] array) {
        int j = 0;
        int[] arrayp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayp[j++] = array[i];
            }
        }
        arrayp = Arrays.copyOf(arrayp, j);
        return arrayp;
    }

    private static int[] method6Ae_makeNegativeArray(int[] array) {
        int j = 0;
        int[] arrayn = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arrayn[j++] = array[i];
            }
        }
        arrayn = Arrays.copyOf(arrayn, j);
        return arrayn;
    }

    private static void method6Ae_calculateStatistics(int[] array) {
        float avg = 0;
        float dev = 0; //deviation
        for(int i = 0; i < array.length; i++) {
            avg+= array[i];
        }
        avg/= (float)array.length;
        System.out.println("Průměr: " + avg);

        for(int i = 0; i < array.length; i++) {
           dev+= Math.pow((array[i] - avg),2);
        }
        dev/= (float)array.length;
        System.out.println("Směrodatná odchylka: " + dev);
    }
}
