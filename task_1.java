import java.util.*;

public class task_1 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList<>(Arrays.asList(1, 52, 8, -4, 0, -10, 15, -7));
        System.out.println("Изначальный список: " + list_num);
        System.out.println("Список нечетных чисел: " + removeEvenValue(list_num));
        System.out.println("Минимальное значение: " + getMin(list_num));
        System.out.println("Максимальное значение: " + getMax(list_num));
        System.out.println("Среднее значение: " + getAverage(list_num));

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> odd_list = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) odd_list.add(i);
        }
        return odd_list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        return Collections.min(list);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int average = 0;
        for (Integer i : list) average += i;
        return average / list.size();
    }
}