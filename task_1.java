// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.*;

    public class task_1 {
        public static void main(String[] args) {
            Map<Double, String> phonesBook = Map.of(88001122333D, "Иван Иванов", 88001662333D, "Иван Курицин", 88001112333D,
                    "Иван Курицин", 88001122432D, "Иван Незлобин", 88001112453D, "Сергей Потапов", 8800163214D, "Сергей Потапов",
                    8800142421D, "Сергей Курицин", 880012343D, "Михаил Незлобин");
            originalMap(phonesBook);
            valueMap(originalMap(phonesBook));
            sortedMap(valueMap(originalMap(phonesBook)));

        }
        public static Map<String, Double> originalMap(Map<Double, String> src) {
            Map<String, Double> newPB = new HashMap<>();
            for (var item : src.entrySet()) {
                if (!newPB.containsValue(item.getValue())) {
                    newPB.put(item.getValue(), item.getKey());
                }
            }
            return newPB;
        }
        public static Map<String, Integer> valueMap(Map<String, Double> src) {
            Map<String, Integer> finalPB = new HashMap<>();
            for (var item : src.keySet()) {
                String name = item.split(" ")[0];
                if (!finalPB.containsKey(name)) {
                    finalPB.put(name, 1);
                } else {
                    finalPB.put(name, finalPB.get(name) + 1);
                }
            }
            return finalPB;
        }
        public static void sortedMap(Map<String,Integer> hashMap) {
            TreeMap <Integer,String> sortedPhonesBook = new TreeMap<>(Collections.reverseOrder());
            for (Map.Entry<String, Integer> item: hashMap.entrySet()) {
                sortedPhonesBook.put(item.getValue(),item.getKey());
            }
            for (var item : sortedPhonesBook.keySet()){
                System.out.println(sortedPhonesBook.get(item) + " - " + item);
            }
        }
    }
