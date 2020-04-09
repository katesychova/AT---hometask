package com.hometask2;

import java.util.Scanner;

public class Human {
    int age;

    public void canSpeak() {
        System.out.println("Can you speak?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            System.out.println("This human can speak");
        } else {
            System.out.println("Ew..");
        }
    }
}
