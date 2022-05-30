package com.davsoncze;

public class Main {


    public static void main(String[] args) {
	// write your code here
        InitApp();

        System.out.println("ZAMESTNANCI, NEJSOU STUDENTI!");
        System.out.println("**********************************************************");
        System.out.println("Uživatel: Karel:");
        CalculateWages(55000,10000,false);
        System.out.println("**********************************************************");
        System.out.println("Uživatel Pavel:");
        CalculateWages(30000,2000,false);
        System.out.println("**********************************************************");
        System.out.println("Uživatel Marek:");
        CalculateWages(9999,1500,false);
        System.out.println("**********************************************************");
        System.out.println("Uživatel Pajaslov s přeplatkem:");
        CalculateWages(15000,16000,false);

        System.out.println("\nZAMESTNANCI, JSOU STUDENTI!");
        System.out.println("**********************************************************");
        System.out.println("Uživatel: Student1:");
        CalculateWages(10000,300,true);
        System.out.println("**********************************************************");
        System.out.println("Uživatel: Student2:");
        CalculateWages(35000,850,true);
        System.out.println("**********************************************************");
        System.out.println("Uživatel: Student3:");
        CalculateWages(55000,3500,true);
        System.out.println("**********************************************************");
        System.out.println("Uživatel: Student4 (S přeplatkem):");
        CalculateWages(25000,25500,true);

    }

    public final static void InitApp(){
            System.out.println("---------------------------------------");
            System.out.println("R210280 {Slonka David} ### 7OOPR2 | HW3");
            System.out.println("---------------------------------------");
            System.out.println("Zadani: Výpočet mzdy\n\n");
    }

    public static void CalculateWages(double grossWage, double amountOfWagesPaid, Boolean isStudent){
        //inicialization
        double incomeTax=0;
        double socialInsurence=0;

        double medical=(grossWage/100)*4.5;

        if (isStudent == true){
            if(grossWage<=10000){
                //student discount
                incomeTax=0;
            }else if(grossWage<3000 && grossWage>10000) {
                    incomeTax=(grossWage/100)*15;
            } else {
                    incomeTax=(grossWage/100)*20;
            }
        }
        else {
            //Any student discount
            socialInsurence = (grossWage/100)*6.5;
            if(grossWage<=10000){
                //student discount
                incomeTax=0;
            }else if(grossWage<3000 && grossWage>10000) {
                incomeTax=(grossWage/100)*15;
            } else {
                incomeTax=(grossWage/100)*20;
            }
        }
        PrintWages(grossWage,amountOfWagesPaid,isStudent,medical,socialInsurence,incomeTax);
    }
    public static void PrintWages(double grossWage, double amountOfWagesPaid, Boolean isStudent, double medical, double socialInsurence, double incomeTax){
        //inicialization
        double answ=0;
        double costs=0;


        System.out.println("       Vypocet mzdy:");
        System.out.println("       -------------");
        System.out.println("       Hruba mzda: " + grossWage);
        System.out.println("       Již vyplacena mzda: " + amountOfWagesPaid);
        if(isStudent==true)  System.out.println("       Status studenta: " + "Ano" +"("+isStudent+")");
        else System.out.println("       Status studenta: " + "Ne" +"("+isStudent+")");

        System.out.print("       Strhnuto: Zdravotni pojisteni: " + medical + " | Socialní pojisteni: " + socialInsurence + " | Dan z prijmu: " + incomeTax+"\n");
        if(isStudent==true) costs = medical+incomeTax;
        else costs = medical+socialInsurence+incomeTax;

        answ=(grossWage-costs)-amountOfWagesPaid;
        if(answ>0) System.out.println("\n       Vyplacena castka: " + answ + " CZK");
        else System.out.println("\n       Máte přeplatak o výši " + answ*(-1) + " CZK");
    }
}
