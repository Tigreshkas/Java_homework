// Обязательная!

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;
public class task_1 {
    public static void WriteLogger(String errors) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("log_except.xml", true);
        logger.addHandler(fh);
        XMLFormatter xmlForm = new XMLFormatter();
        fh.setFormatter(xmlForm);
        logger.log(Level.INFO, errors);
        fh.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Введите число в байтовом формате: ");
        String string_num = "";
        try {
            Scanner scn = new Scanner(System.in);
            byte byte_num = scn.nextByte();
            string_num = Byte.toString(byte_num);
            scn.close();
            System.out.println("Введено в байтах: " + string_num);

        } catch (Exception ex) {
            WriteLogger(ex.toString());
        }
        FileWriter fw = new FileWriter("result.txt", true);
        fw.write( string_num + "\n");
        fw.flush();
        fw.close();

    }
}

//тип данных byte хранит целое число от -128 до 127 и занимает 1 байт, поэтому результаты ввода 100 и 200 отличаются.