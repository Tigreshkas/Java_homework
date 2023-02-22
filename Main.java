// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> params = Map.of("price", 34999, "RAM", 8);

        Laptop laptop_1 = new Laptop();
        laptop_1.name = "Asus";
        laptop_1.OS = "Linux";
        laptop_1.color = "Gray";
        laptop_1.weight = 2.1;
        laptop_1.RAM = 8;
        laptop_1.memory = 128;
        laptop_1.price = 34999;


        Laptop laptop_2 = new Laptop();
        laptop_2.name = "Acer";
        laptop_2.OS = "Windows";
        laptop_2.color = "Black";
        laptop_2.weight = 2.3;
        laptop_2.RAM = 4;
        laptop_2.memory = 128;
        laptop_2.price = 28399;

        Laptop laptop_3 = new Laptop();
        laptop_3.name = "Lenovo";
        laptop_3.OS = "Without OS";
        laptop_3.color = "Grey";
        laptop_3.weight = 2.2;
        laptop_3.RAM = 4;
        laptop_3.memory = 1024;
        laptop_3.price = 22999;

        Laptop laptop_4 = new Laptop();
        laptop_4.name = "Asus";
        laptop_4.OS = "Linux";
        laptop_4.color = "Black";
        laptop_4.weight = 2.5;
        laptop_4.RAM = 8;
        laptop_4.memory = 512;
        laptop_4.price = 45000;

        Laptop laptop_5 = new Laptop();
        laptop_5.name = "Lenovo";
        laptop_5.OS = "Windows";
        laptop_5.color = "Blue";
        laptop_5.weight = 1.8;
        laptop_5.RAM = 8;
        laptop_5.memory = 256;
        laptop_5.price = 34999;

        List<Laptop> laptop = new ArrayList<>(Arrays.asList(laptop_1,laptop_2,laptop_3,laptop_4,laptop_5));
        List<Laptop> filteredLaptops = laptop.stream().filter(l -> l.price == params.get("price") &&
                l.RAM == params.get("RAM")).toList();
        System.out.printf("Выбранные параметры: цена - " + params.get("price") + ", память - " + params.get("RAM") + ":\n");
        for (Laptop item : filteredLaptops) {
            System.out.println(item.toString());
        }
    }
}