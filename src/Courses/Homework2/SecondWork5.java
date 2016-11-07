package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 06.11.2016.
 */
public class SecondWork5 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Является ли 3 делителем введённого числа?.");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a % 3 == 0 && a != 0) {
            System.out.println("Число " + a + " делится на 3 нацело.");
        } else {
            System.out.println("Число " + a + " не делится на 3 нацело.");
        }
    }

}
