package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 06.11.2016.
 */

/*
Даны вещественные числа х и у, не равные друг другу. Меньшее из этих
двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */

public class SecondWork9 {
    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scanner.nextDouble();
        System.out.println();
        System.out.print("Введите y: ");
        y = scanner.nextDouble();
        System.out.println();

        double sum = (x + y) / 2;
        double mult = 2 * (x * y);

        if (x != y) {
            if (x < y) {
                x = sum;
                y = mult;
                System.out.println("Половина суммы: " + x);
                System.out.println("Удвоенное произведение: " + y);

            } else {
                x = mult;
                y = sum;
                System.out.println("Половина суммы: " + y);
                System.out.println("Удвоенное произведение: " + x);
            }
        }
        else{
            System.out.println("x = y");
        }
    }
}
