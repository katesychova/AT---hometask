package com.hometask2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Automation automation = new Automation(33, "Nikita", "Owl");
        Manual manual = new Manual(21, "Kiwi", "Bird");
        automation.canSpeak();
        System.out.println(automation.canInventCode("yes"));
        manual.canSpeak();
        System.out.println(manual.canInventCode("no"));
    }
}
