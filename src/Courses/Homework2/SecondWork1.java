package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 05.11.2016.
 */
public class SecondWork1 {
    public static void main(String[] args) {
        double a = 0, b = 0;
        System.out.println("Нахождение частного двух чисел.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        a = scanner.nextDouble();
        System.out.println();
        System.out.print("Введите знаменатель: ");
        b = scanner.nextDouble();
        System.out.println();

        if (a!=0 & b!=0){
            double c = a/b;
            System.out.println("Частное равно = " + c);
        }
        else {
            System.out.println("Операция невозможна. Одно из чисел равно 0.");
        }

    }
}
