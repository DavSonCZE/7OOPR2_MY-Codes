package cz.davsoncze;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContactList {
    private List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact (Contact contact) {
        contacts.add(contact);
    }

    public Contact getContactByEmail(String email) {
        return contacts.stream()
                .filter(contact -> contact.getEmails().contains(email))
                .findFirst()
                .orElse(null);
    }

    public Set<Contact> getContactsByEmail(String email){
        return contacts.stream()
                .filter(contact -> contact.getEmails().contains(email))
                .collect(Collectors.toSet());
    }
}
