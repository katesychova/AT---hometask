package com.task1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //5. Циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й станет 4-м и т.д.)
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int tmp1 = 0;
        boolean firstTime1 = true;
        int last = array[number - 1];
        for (int i = 0; i < number; i++) {
            if (i + 1 < number) {
                if (firstTime1) {
                    tmp1 = array[i + 1];
                    array[i + 1] = array[i];
                    firstTime1 = false;
                } else {
                    int tmp2 = tmp1;
                    tmp1 = array[i + 1];
                    array[i + 1] = tmp2;
                }
            }
        }
        array[0] = last;

        tmp1 = 0;
        firstTime1 = true;
        last = array[number - 1];
        for (int i = 0; i < number; i++) {
            if (i + 1 < number) {
                if (firstTime1) {
                    tmp1 = array[i + 1];
                    array[i + 1] = array[i];
                    firstTime1 = false;
                } else {
                    int tmp2 = tmp1;
                    tmp1 = array[i + 1];
                    array[i + 1] = tmp2;
                }
            }
        }
        array[0] = last;

        for (int i = 0; i < number; i++) System.out.print(array[i] + " ");
    }
}
