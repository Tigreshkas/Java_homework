//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_2 {
    public task_2() {
    }

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 8, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1, d2));
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        ArrayDeque<Integer> rez = new ArrayDeque<>();
        int num = 0;

        while(d1.size() > 0 && d2.size() > 0) {
            int temp = d1.removeFirst() + d2.removeFirst() + num;
            if (temp > 9) {
                rez.add(temp % 10);
                num = 1;
            } else {
                rez.add(temp);
                num = 0;
            }
        }
        if (num == 1) {
            rez.add(1);
        }
        return rez;
    }
}
