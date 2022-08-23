package osu.david;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Person{

    String name;
    Date dateOfBirth;
    List<String> emails;

    public Person(String name, Date dateOfBirth, List<String> emails) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getEmails() {
        List<String> sorted = new ArrayList<>();
        Collections.sort(emails);
        sorted.addAll(emails);
        return sorted;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
