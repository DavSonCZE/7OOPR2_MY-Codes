package osu.david;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        final int cons = 1900; //kvůli rokům

        String[] emails = { "david@seznam.cz", "abraham@s.cz", "zofie@a.cz"};
        Person p1 = new Person("David", new Date(1998-cons, Calendar.JANUARY,14), Arrays.asList(emails));

        System.out.println("Name: " + p1.getName() + ", Date: "+p1.getDateOfBirth() + ", Emails: " + p1.getEmails());
    }
}
