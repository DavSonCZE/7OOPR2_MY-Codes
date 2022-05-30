package cz.davsoncze;

import java.util.stream.Collectors;

import static cz.davsoncze.SP_VIISimple.*;

public class Main {

    public static void main(String[] args) {

        //SP_VII Simple
        /*GeneratedHashSet(100000);
        GeneratedTreeSet(100000);
        GeneratedArrayList(100000);
        GeneratedLinkedList(100000);*/

        //SP_VII Extended
        ContactList contactList = new ContactList();
        Contact c1 =  new Contact("David", "Ostuda", "davidslonka@gg.com");
        c1.addEmail("slonka.school@gg.com");
        c1.addEmail("slonka.trash@gg.com");
        c1.addTelNumber(111100110);
        c1.addTelNumber(111100120);
        c1.addTelNumber(111100130);
        c1.addTelNumber(111100140);
        c1.addTelNumber(111100150);
        contactList.addContact(c1);

        Contact c2 =  new Contact("Petr", "Stankušovic", "stankusovic@google.com");
        c2.addEmail("stankusovic.school@google.com");
        c2.addEmail("stankusovic.trash@google.com");
        c2.addTelNumber(111200110);
        contactList.addContact(c2);

        Contact c3 =  new Contact("Martin", "Varady", "varady@google.com");
        c3.addEmail("varady.school@google.com");
        c3.addEmail("varadymaradvlaky@google.com");
        c3.addTelNumber(111300110);
        c3.addTelNumber(111300120);
        contactList.addContact(c3);

        Contact c4 =  new Contact("Marek", "Vašut", "vasut@google.com");
        c4.addEmail("varady@google.com");
        c4.addEmail("vasut.trash@google.com");
        c4.addTelNumber(111400110);
        c4.addTelNumber(111400120);
        contactList.addContact(c4);

        Contact c5 =  new Contact("Marek", "Párek", "vasut@google.com");
        c5.addEmail("parek.school@google.com");
        c5.addEmail("parek.hentai@google.com");
        c5.addTelNumber(111500111);
        contactList.addContact(c5);

        System.out.println("LIST OF ALL USERS: ");
        System.out.println("-------------------");
        contactList.getContacts().stream().forEach(el -> System.out.println("Osoba: " + el.getName() + el.getSurname() + " -> have email: " + el.getEmails() + ", have telephone numbers " + el.getTelNumbers()));
    }
}
