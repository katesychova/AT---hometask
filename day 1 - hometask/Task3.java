package com.task1;

public class Task3 {
    public static void main(String[] args) {
        // 3. Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.
        for (int i = 2; i < 21; i++) {
            if (i > 10 && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
