package com.davsoncze;

import com.davsoncze.enums.Gender;
import com.davsoncze.enums.PlayerPosition;

public class Player {
    private String name;
    private String surname;
    private String nick;
    private char oneCharIcon;
    private String email;
    private Gender gender;
    private int height;
    private int weight;
    private PlayerPosition position;
    private int skillLevel;
    private double credit;

    public Player(String name, String surname, String nick, char oneCharIcon, String email, Gender gender, int height, int weight, PlayerPosition position) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.oneCharIcon = oneCharIcon;
        this.email = email;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.skillLevel = 0;
        this.credit = 0;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public char getOneCharIcon() {
        return oneCharIcon;
    }

    public void setOneCharIcon(char oneCharIcon) {
        this.oneCharIcon = oneCharIcon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nick='" + nick + '\'' +
                ", oneCharIcon=" + oneCharIcon +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", position=" + position +
                ", skillLevel=" + skillLevel +
                ", credit=" + credit +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}