package com.davsoncze;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Operation {
    protected static final String[] pattern = {"dd.MM.yyyy", "dd.MM.yyyy HH:mm:ss", "dd. MMMMM yyyy HH:mm", "yyyy-MM-dd HH:mm", "ddMMyyyyHHmm", "HH:mm"};
    protected static SimpleDateFormat simpleDateFormat =  new SimpleDateFormat();
    protected static final int cons = 1900;

    /*
         Samostatný příklad V - extended:
            a) Načtěte od uživatele do vhodné instance datum ve formátu den-měsíc-rok.
            b) Načtěte od uživatele do vhodné instance datum ve formátu hodina-minuta.
            c) Vytvořte novou instanci vhodného formátu den-měsíc-rok-hodina-minuta(-sekunda) sloučením hodnot získaných v bodech a), b).
            d) Zjistěte v letech (desetinné číslo) rozdíl mezi hodnotou v c) a aktuálním dnem. Výsledkem je desetinné číslo (napřiklad 13,748 roku).
            e) Vypište hodnotu z c) ve formátu typu "5. března 2017 14:30", 2017-03-05 14:30", "20170305T1430" a "050320171430".
    */

    // skenovani vstupu
    public static Date GetInputDate() {
        int day=1, month=0, year=0;
        System.out.println("Zadej datum: \n -----------");
            System.out.println("\nDen (1-31): ");
            Scanner scan= new Scanner(System.in);
                day = scan.nextInt();
            System.out.println("\nMonth (1-12): ");
                month = scan.nextInt()-1;
            System.out.println("\nYear: ");
                year = scan.nextInt();
        Date date = new Date(year-cons,month,day);
        return date;
    }

    public static Time GetInputTime() {
        int hour = 0, minute = 0, second = 0;
        System.out.println("Zadej datum: \n -----------");


                System.out.println("\nHour: ");
                Scanner scan = new Scanner(System.in);
                    hour = scan.nextInt();
                System.out.println("\nMinute: ");
                    minute = scan.nextInt();
                System.out.println("\nSecond: ");
                    second = scan.nextInt();

        Time time = new Time(hour,minute,second);
        return time;
    }

    //Vypis vytupu

    public static void runAllFunctions(){
        Date date = GetInputDate();
        Time time = GetInputTime();
        Date actualDate = new Date();

        System.out.println("Write only date: ");
        WriteDate(date);
        System.out.println("Write only time: ");
        WriteTime(date, time);
        System.out.println("Write only date and Time: ");
        WriteDateAndTime(date, time);
        System.out.println("Write difference between actual day: ");
        WriteDifferenceBetweenActualDay(date,actualDate);
        System.out.println("Write all formats: ");
        WriteALLFormats(date, time);


    }

    public static void WriteDate(){
        Date date = GetInputDate();
        simpleDateFormat.applyPattern(pattern[0]);
        System.out.println("Datum: " + simpleDateFormat.format(date));
    }

    public static void WriteDate(Date date){
        simpleDateFormat.applyPattern(pattern[0]);
            System.out.println("Datum: " + simpleDateFormat.format(date));
    }

    public static void WriteTime(){
        Date date = GetInputDate();
        Time time = GetInputTime();
        simpleDateFormat.applyPattern(pattern[5]);
        System.out.println("Cas: " + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(),time.getSeconds())));
    }
    
    public static void WriteTime(Date date, Time time){
        simpleDateFormat.applyPattern(pattern[5]);
        System.out.println("Cas: " + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(),time.getSeconds())));
    }

    public static void WriteDateAndTime(){
        Date date = GetInputDate();
        Time time = GetInputTime();
        simpleDateFormat.applyPattern(pattern[1]);
        System.out.println("Datum: " + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(),time.getSeconds())));
    }

    public static void WriteDateAndTime(Date date, Time time){
        simpleDateFormat.applyPattern(pattern[1]);
        System.out.println("Datum: " + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(),time.getSeconds())));
    }

    public static void WriteDifferenceBetweenActualDay(){
        Date date = GetInputDate();
        Date actualDate = new Date();
        long diff = Math.abs(date.getTime() - actualDate.getTime());
        float yearDiff = diff/1000f/60f/60f/24f/365f;
        System.out.println("Rozdil v letech: " + yearDiff);
    }

    public static void WriteDifferenceBetweenActualDay(Date date, Date actualDate){
        long diff = Math.abs(date.getTime() - actualDate.getTime());
        float yearDiff = diff/1000f/60f/60f/24f/365f;
        System.out.println("Rozdil v letech: " + yearDiff);

    }

    public static void WriteAllFormats(){
        Date date = GetInputDate();
        Time time = GetInputTime();
        for(int i=1; i<5; i++){
            switch(i){
                case 1:
                    simpleDateFormat.applyPattern(pattern[1]);
                    break;
                case 2:
                    simpleDateFormat.applyPattern(pattern[2]);
                    break;
                case 3:
                    simpleDateFormat.applyPattern(pattern[3]);
                    break;
                case 4:
                    simpleDateFormat.applyPattern(pattern[4]);
                    break;
            }
            System.out.println("Datum format " + i + " :" + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(), time.getSeconds())) + "\n" );        }
    }

    public static void WriteALLFormats(Date date, Time time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        for(int i=1; i<5; i++){
            switch(i){
                case 1:
                    simpleDateFormat.applyPattern(pattern[1]);
                    break;
                case 2:
                    simpleDateFormat.applyPattern(pattern[2]);
                    break;
                case 3:
                    simpleDateFormat.applyPattern(pattern[3]);
                    break;
                case 4:
                    simpleDateFormat.applyPattern(pattern[4]);
                    break;
            }
            System.out.println("Datum format " + i + " :" + simpleDateFormat.format(new Date(date.getYear(),date.getMonth(),date.getDate(),time.getHours(),time.getMinutes(), time.getSeconds())) + "\n" );
        }
    }

}
