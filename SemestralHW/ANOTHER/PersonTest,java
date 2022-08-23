package osu.david;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testSorting(){
        //add person
        String[] inputEmails = { "david@seznam.cz", "abraham@s.cz", "zofie@a.cz"};
        Person p1 = new Person("David",new Date(1998-1900,Calendar.JANUARY,14), Arrays.asList(inputEmails));

        List<String> expectedEmails = Arrays.asList("abraham@s.cz", "david@seznam.cz", "zofie@a.cz");
        List<String> actualEmails = p1.getEmails();
        Assert.assertEquals(actualEmails, expectedEmails);
    }


}
