package cz.davsoncze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contact {
    static private Integer maxTelNumberCount = 5;

    private String name;
    private String surname;
    private Set<String> emails;
    private List<Integer> telNumbers;

    public Contact(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.emails = new HashSet<>(List.of(email));
        this.telNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public boolean addTelNumber(int telNumber) {
        if (telNumbers.size() >= maxTelNumberCount)
        {
            System.out.println("Limit tel. čísel ("+ maxTelNumberCount + ") nesmí být překročen!");
            return false;
        }

        for (Integer tn : telNumbers) {
            if (tn == telNumber) {
                System.out.println("Duplicitní tel. číslo!");
                return false;
            }
        }

        telNumbers.add(telNumber);
        return true;
    }

    public List<Integer> getTelNumbers() {
        return telNumbers;
    }
}

