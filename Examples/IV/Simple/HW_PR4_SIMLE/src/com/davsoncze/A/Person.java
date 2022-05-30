package com.davsoncze.A;

import java.util.Arrays;

public class Person {
        private String name;
        private String surname;
        private Integer age;
        private String telNumber;

        public Person(String name, String surname, Integer age, String telNumber) {
                this.name = name;
                this.surname = surname;
                this.age = age;
                this.telNumber = telNumber;
        }

        public String getName() {
                return name;
        }

        public String getSurname() {
                return surname;
        }

        public Integer getAge() {
                return age;
        }

        public String getTelNumber() {
                return telNumber;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public void setTelNumber(String telNumber) {
                this.telNumber = telNumber;
        }

        @Override
        public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", age=" + (age == null ? "'Not set'" : age) +
                        ", tel. number='" + telNumber + '\'' +
                        '}';
        }

        public String splitNumber() {
                String[] array = telNumber.split("(?<=\\G.{3})");
                return String.join(" ", array);
        }

        public static boolean checkCharacter(String str, String ch) {
                return str.contains(ch);
        }
}
