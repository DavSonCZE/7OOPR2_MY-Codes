package osu.slonka;

import java.util.List;

public class User {
    private String name;
    private String address;
    private List<Integer> phoneNumbers;
    private List<String> emailAddresses;
    private List<Penalty> penalties;

    public User(String name, String address, List<Integer> phoneNumbers, List<String> emailAddresses, List<Penalty> penalties) {
        this.name = name;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
        this.penalties = penalties;
    }

    public void addPenalty(Penalty penalty) {
        penalties.add(penalty);
    }

    public List<Penalty> getPenalties() {
        return penalties;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddresses=" + emailAddresses +
                ", penalties=" + penalties +
                '}';
    }
}
