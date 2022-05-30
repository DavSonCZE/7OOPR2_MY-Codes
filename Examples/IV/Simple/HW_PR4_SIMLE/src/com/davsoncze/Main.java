package com.davsoncze;

import com.davsoncze.A.Person;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person("Dobroděj", "Puštík", null, "888943444");
        System.out.println(person);
        person.splitNumber();
    }
}
