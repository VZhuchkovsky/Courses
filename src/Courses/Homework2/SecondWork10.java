package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 07.11.2016.
 */
public class SecondWork10 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        System.out.println("Нахождение коэффициентов уравнения вида ax^3 + bx = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите а: ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Введите b: ");
        b = scanner.nextInt();
        System.out.println();
        int c = a*b;

        if(a==0 && b==0){
            System.out.println("х - любой.");
        }
        else if(a==0 || b==0){
            System.out.println("x = 0");
        }
        else if(c < 0){
            System.out.println("х1 = 0");
            double x2 = Math.sqrt(-b/a);
            double x3 = -x2;
            System.out.println("x2 = " + x2);
            System.out.println("x3 = " + x3);
        }
        else{
            System.out.println("Ошибка. Решение лежит в комплексном поле.");
        }

    }
}
