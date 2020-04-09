package com.hometask2;

import java.util.Scanner;

public class Manual extends Engineer {

    public Manual(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean canInventCode(String answer) {
        if (answer == "yes") {
            return true;
        }
        return false;
    }
}
