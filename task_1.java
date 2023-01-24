// 1. Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].


import java.util.ArrayList;
import java.util.Collections;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList;
        newArrayList = GenerateRandomArray(0, 300);
        // System.out.println(newArrayList); // посмотреть весь сгенерированный массив
        System.out.println("Максимальное значение массива: " + Collections.max(newArrayList));
        System.out.println("Минимальное значение массива: " + Collections.min(newArrayList));
        System.out.println("Среднее (арифметическое) значение массива: " + FindMiddle(newArrayList));
        // System.out.println(newArrayList.size()); // посмотреть все значения массива
    }

    private static Integer FindMiddle(ArrayList<Integer> newArrayList) {
        int length = newArrayList.size();
        int average = 0;
        if (length > 0) {
            int sum = 0;
            for (Integer integer : newArrayList) {
                sum += integer;
            }
            average = sum / length;
        }
        return average;
    }

    private static ArrayList<Integer> GenerateRandomArray(int min, int max) {
        ArrayList<Integer> output = new ArrayList<>();
        int range = (max - min) + 1;
        for (int i = 0; i < Math.random() * range + min; i++) {
            output.add((int) (Math.random() * range + min));
        }
        return output;
    }
}
