package com.davsoncze;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Operation {
    protected static final String[] pattern = {"dd.MM.yyyy"};
    protected static SimpleDateFormat simpleDateFormat =  new SimpleDateFormat();
    protected static final int cons = 1900;

    /*
         Samostatný příklad V - simple:
            a) Vytvořte instanci třídy reprezentující den-měsíc-rok. Nastavte jej na vaše datum narození a vypište jej na konzoli.
            b) Vytvořte instanci třídy reprezentující den-měsíc-rok nastavené na aktuální datum. Vypište jej na konzoli.
            c) Instanci z předchozího bodu změňte rok na rok 2000. Vypište.
            d) Instanci celou přepracujte na štědrý den roku 1999. Výsledek vypište.
    */

    public static void test(){
        getFormatedDateOfBirth();
        getFormatedActualDate();
        getFormatedDateWithYear1999();
        getFormatedDateWithYear2000();
    }

    public static void getFormatedDateOfBirth(){
        Date birthOfDate = new Date(1998-cons, Calendar.JANUARY,14);
        simpleDateFormat.applyPattern(pattern[0]);
        System.out.println("Vypis meho data narozeni: " + simpleDateFormat.format(birthOfDate));
    }

    public static void getFormatedActualDate(){
        Date date = new Date();
        simpleDateFormat.applyPattern(pattern[0]);
        System.out.println("Aktualni datum je: " + simpleDateFormat.format(date));
    }

    public static void getFormatedDateWithYear1999(){
        Date date = new Date(1999-cons, Calendar.FEBRUARY,11);
        simpleDateFormat.applyPattern(pattern[0]);
        System.out.println("Datum s rokem(1999): " + simpleDateFormat.format(date));
    }

    public static void getFormatedDateWithYear2000(){
        Date date = new Date(2000-cons, Calendar.JANUARY,14);
        simpleDateFormat.applyPattern(pattern[0]);
        System.out.println("Datum s rokem(2000): " + simpleDateFormat.format(date));
    }
}
