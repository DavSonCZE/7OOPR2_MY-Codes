package cz.davsoncze;

import org.junit.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testAnotherContactWithSameMail(){
        Contact c1 =  new Contact("David", "Ostuda", "david@google.com");
        c1.addEmail("slonka.school@gg.com");
        c1.addEmail("david@google.com");

        int actual = c1.getEmails().size();
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void contactHaveMoreThanFiveTelNumbers(){
        Contact c1 =  new Contact("David", "Ostuda", "davidslonka@gg.com");
        c1.addTelNumber(111222333);
        c1.addTelNumber(111222340);
        c1.addTelNumber(111222350);
        c1.addTelNumber(111222360);
        c1.addTelNumber(111222370);
        c1.addTelNumber(111222380);

        int actual = (int) c1.getTelNumbers().stream().count(); //pocitam od 0
        int expected = 5;
        assertEquals(expected,actual);
    }

}