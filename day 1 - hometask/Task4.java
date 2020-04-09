package com.task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 4. Пройти по массиву и поменять местами каждые 2 соседних элемента.
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        int a = 0;
        int b = 10;
        for (int i = 0; i < number; i++) {
            array[i] = ((int) Math.round((a + Math.random() * (b - a + 1))));
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < number; i = i + 2) {
            if (i + 1 < number) {
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tmp;
                System.out.print(array[i] + " " + array[i + 1] + " ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
