package cz.davsoncze;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactListTest {
    @Test
    public void findContactByEmailAndReturnNull(){
        ContactList contactList = new ContactList();
        Contact c1 =  new Contact("David", "Ostuda", "david@google.com");
        c1.addEmail("slonka.school@gg.com");
        c1.addTelNumber(111222333);
        contactList.addContact(c1);

        int actualSize = contactList.getContactsByEmail("david1@google.com").size();
        int expectedSize = 0;
        assertEquals(expectedSize, actualSize);
    }
    @Test
    public void findContactByEmailWithThisEmail(){
        ContactList contactList = new ContactList();
        Contact c1 =  new Contact("David", "Ostuda", "david@google.com");
        c1.addEmail("slonka.school@gg.com");
        c1.addTelNumber(111222333);
        contactList.addContact(c1);

        int actual = contactList.getContactsByEmail("david@google.com").size(); //pocitam od 0
        int expected = 1;
        assertEquals(expected, actual);
    }

}