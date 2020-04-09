package com.task1;

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        // 1. Описать разницу между i++ и ++i, привести пример.
        // ++i increments the value and then returns it, for example:
        int a = 5;
        int i = 5;
        a = ++i;
        //expected result is 6
        System.out.println(a);
        // i ++ returns a value and then increments it, for example:
        a = i++;
        //expected result is also 6;
        System.out.println(a);
    }
}
