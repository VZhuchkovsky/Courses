package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 05.11.2016.
 */
public class SecondWork2 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        System.out.println("Укажите дату основания Одессы.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Введите номер месяца: ");
        b = scanner.nextInt();
        System.out.println();
        System.out.print("Введите год: ");
        c = scanner.nextInt();
        System.out.println();

        if( a == 2 && b == 9 && c == 1794){
            System.out.println("Верно!");
        }
        else {
            System.out.println("Вы допустили ошибку.");
        }

    }
}
