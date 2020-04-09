package com.task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task6 {
    public static void main(String[] args) {
        //6. Используя Collection и Stream создать из массива коллекцию, отфильтровать оставив только четные числа, и
        // вывести каждое число от 2 до 20 включительно и больше 10 в порядке по возрастанию.
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        int a = 2;
        int b = 25;
        for (int i = 0; i < number; i++) {
            array[i] = ((int) Math.round((a + Math.random() * (b - a + 1))));
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        Integer[] integerArray = IntStream.of(array).boxed().toArray(Integer[]::new);
        Collection<Integer> collection = Arrays.asList(integerArray);
        collection.stream().filter(n -> n % 2 == 0 && n != 0 && n>10).sorted().forEach(System.out::println);
    }
}
