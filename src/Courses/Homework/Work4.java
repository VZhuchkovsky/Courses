package Courses.Homework;

import java.util.Scanner;

/**
 * Created by Vlad on 04.11.2016.
 */

/*
 Написать программы, которые будут высчитывать значение переменной ans, по заданным формулам;
 x = a, y = b;
 */

public class Work4 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, d = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        a = scanner.nextDouble();
        System.out.println("Введите b: ");
        b = scanner.nextDouble();
        System.out.println("Введите c: ");
        c = scanner.nextDouble();
        System.out.println("Введите d: ");
        d = scanner.nextDouble();


        double formula1 = ((b + Math.sqrt(Math.pow(b,2) + (4*a*c)))/(2 * a)) - (Math.pow(a,3)*c) + Math.pow(b, -2);
        System.out.println("Ответ по первой формуле: " + formula1);
        double formula2 = ((a / c) * (b / d)) - ((a * b - c) / (c * d));
        System.out.println("Ответ по второй формуле: " + formula2);
        double formula3 = a - (Math.pow(a, 3) / 3) + (Math.pow(a, 5) / 5);
        System.out.println("Ответ по третьей формуле: " + formula3);
        double formula4 = ((a + b) / (b + 1)) - ((a * b - 12) / (34 + a));
        System.out.println("Ответ по четвёртой формуле: " + formula4);
        double formula5 = Math.sin(Math.sqrt(a + 1)) - Math.sin(Math.sqrt(a - 1));
        System.out.println("Ответ по пятой формуле: " + formula5);
    }
}
