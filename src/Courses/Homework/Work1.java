package Courses.Homework;

import java.util.Scanner;

/**
 * Created by Vlad on 01.11.2016.
 */

/*
Написать программу, которая будет высчитывать корни для квадратного уравнения.
Ввод коэффициентов при неизвестных производится при выполнении программы.
*/

public class Work1 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        System.out.println("Нахождение коэффициентов уравнения вида ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а: ");
        a = scanner.nextInt();
        System.out.println("Введите b: ");
        b = scanner.nextInt();
        System.out.println("Введите c: ");
        c = scanner.nextInt();
        System.out.println("Решение уравнения: " + a + "x^2 + " + b + "x + " + c);
        double D = Math.pow(b, 2) - 4 * a * c;
        double x1 = 0, x2 = 0;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("D>0, поэтому уравнение имеет два решения: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            x1 = -(b / (2 * a));
            System.out.println("D=0, поэтому уравнение имеет одно решение: ");
            System.out.println("x1 = x2 = " + x1);
        }
        else {
            System.out.println("D<0, поэтому уравнение не имеет решения.");
        }
    }
}
