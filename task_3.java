import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class task_3 {

    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false

    public static void main(String[] args) {
        String str = ")()(";
        Deque<Character> char_deq = new ArrayDeque<>();
        for (int x = 0; x < str.length(); x++) {
            char_deq.add(str.charAt(x));
        }
        System.out.println(str + " = " + validate(char_deq));
    }

    public static boolean validate(Deque<Character> deque) {
        char ch = deque.pop();
        while (deque.size() > 0) {
            if (deque.size() % 2 == 0 || ch == ')' || ch == '}' || ch == ']') {
                ch = '-';
                break;
            }
            if (ch == '(' && deque.getFirst() == ')' || ch == '{' && deque.getFirst() == '}' ||
                    ch == '[' && deque.getFirst() == ']') {
                try {
                    deque.pop();
                    ch = deque.pop();
                }
                catch (NoSuchElementException e) {
                    ch = ' ';
                }
            }
            if (ch == '(' && deque.getLast() == ')' || ch == '{' && deque.getLast() == '}' ||
                    ch == '[' && deque.getLast() == ']') {
                try {
                    ch = deque.pop();
                    deque.removeLast();
                }
                catch (NoSuchElementException e) {
                    ch = ' ';
                }
            }
        }
        return ch == ' ';
    }
}