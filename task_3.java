// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

import java.util.ArrayList;


public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 0) {
                arr.add(i);
            }
        }
        System.out.println("Простые числа от 2 до 100: \n" + arr);
    }
}
