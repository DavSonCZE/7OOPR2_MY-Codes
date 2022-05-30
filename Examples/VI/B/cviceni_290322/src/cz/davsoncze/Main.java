package cz.davsoncze;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //Samostatný příklad VI B - simple
        //1) Vytvořte třídu Person definující jméno, příjmení a věk uživatele. Realizujte nativní řazení třídy Person podle příjmení, při shodě příjmení podle jména.
        method_6B_s1a();
        //2) Vytvořte list čísel a seřaďte ho sestupně(!)
        method_6B_s1a();

        //Samostatný příklad VI B - extended
        //method_6B_e1a();
        //method_6B_e1b();
    }

    private static void method_6B_s1a(){
        //Samostatný příklad VI b - simple
        //      Vytvořte třídu Person definující jméno, příjmení a věk uživatele. Realizujte nativní řazení třídy Person podle příjmení, při shodě příjmení podle jména.
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("David", "Slonka", 24));
        people.add(new Person("David", "Slonka", 25));
        people.add(new Person("David", "Slonka", 23));
        people.add(new Person("Anakin","Slonka",45));
        people.add(new Person("Adela","Nova",20));
        people.add(new Person("Martin","Varady", 15));

        Collections.sort(people);
        System.out.println(" -- SORTING DATA BY SURNAME & EXCEPTION SORT SAME SURNAME BY NAME  -- ");
        for (Person person : people){
            System.out.println(person.toString());
        }
    }
    private static void method_6B_s1b(){
        //2) Vytvořte list čísel a seřaďte ho sestupně(!)
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=20;i>-1;i--){
            numbers.add(i);
        }
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(" -- SORTING DATA BY SURNAME & EXCEPTION SORT SAME SURNAME BY NAME  -- ");
        for (Integer number: numbers){
            System.out.println(number);
        }
    }

    private static void method_6B_e1a(){
        //Samostatný příklad VI b - simple
        //      Vytvořte třídu Person definující jméno, příjmení a věk uživatele. Realizujte nativní řazení třídy Person podle příjmení, při shodě příjmení podle jména.
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("David", "Slonka", 24));
        people.add(new Person("David", "Slonka", 25));
        people.add(new Person("David", "Slonka", 23));
        people.add(new Person("David", "Slonka", 23));
        people.add(new Person("Anakin","Slonka",45));
        people.add(new Person("Adela","Nova",20));
        people.add(new Person("Martin","Varady", 15));
        PersonComparator personComparator = new PersonComparator();
        personComparator.setOrderDescending(true);

        Collections.sort(people, personComparator);
        System.out.println(" -- SORTING DATA BY SURNAME, NAME, AGE DESCENDING  -- ");
        for (Person person : people){
            System.out.println(person.toString());
        }

        personComparator.setOrderDescending(false);
        Collections.sort(people, personComparator);
        System.out.println(" -- SORTING DATA BY SURNAME, NAME, AGE ASCENDING  -- ");
        for (Person person : people){
            System.out.println(person.toString());
        }
    }

    private static void method_6B_e1b(){
        //Samostatný příklad VI b - simple
        //      Vytvořte třídu Person definující jméno, příjmení a věk uživatele. Realizujte nativní řazení třídy Person podle příjmení, při shodě příjmení podle jména.
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("David", "Slonka", 24));
        people.add(new Person("David", "Slonka", 25));
        people.add(new Person("David", "Slonka", 23));
        people.add(new Person("David", "Slonka", null));
        people.add(new Person("Anakin","Slonka",45));
        people.add(new Person("Adela","Nova",20));
        people.add(new Person("Martin","Varady", 15));
        PersonAgeComparator personAgeComparator = new PersonAgeComparator();

        Collections.sort(people, personAgeComparator);
        System.out.println(" -- SORTING DATA BY AGE DESCENDING  -- ");
        for (Person person : people){
            System.out.println(person.toString());
        }
    }
}

