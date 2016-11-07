package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 05.11.2016.
 */
public class SecondWork4 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Проверка числа на чётность.");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a % 2 == 0 && a != 0) {
            System.out.println("Число " + a + " является чётным");
        } else {
            System.out.println("Число " + a + " не является чётным");
        }
    }
}
