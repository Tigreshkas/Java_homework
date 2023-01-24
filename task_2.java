// 2. Реализуйте алгоритм сортировки пузырьком для сортировки массива.


import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, -2, 9, 5, -3, 0, 10};
        System.out.println("Изначальный массив: \n" + Arrays.toString(arr));
        bubble_sort_increace(arr);
        System.out.println("Отсортированный по возрастанию массив: \n" + Arrays.toString(arr));
    }

    public static void bubble_sort_increace(int[] arr) {
        // сортировка пузырьком по возрастанию
        int num;
        int len = arr.length - 2;
        boolean flag;
        for (int i = 0; i <= len; i++) {
            flag = false;
            for (int j = len; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    num = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

    }
}
