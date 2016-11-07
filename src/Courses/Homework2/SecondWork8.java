package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 07.11.2016.
 */

/*
Дано трехзначное число. Определить, равен ли квадрат этого числа сумме кубов его цифр.
 */

public class SecondWork8 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввежите трёхзначное число: ");
        number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int ones = (number - hundreds * 100 - tens * 10);

        int square = (int) Math.pow(number, 2);
        int cubes = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3));

        if (number < 100 && number > 999) {
            System.out.println("Ошибка. Число не трёхзначное.");

        } else {

            if (square == cubes) {
                System.out.println("Квадрат этого числа равен сумме кубов его цифр.");
                System.out.println("Квадрат и сумма кубов числа : " + square);
            } else {
                System.out.println("Квадрат этого числа не равен сумме кубов его цифр.");
                System.out.println("Квадрат числа: " + square);
                System.out.println("Сумма кубов числа: " + cubes);
            }

        }
    }

}
