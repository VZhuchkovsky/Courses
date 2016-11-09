package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 09.11.2016.
 */
public class ThirdWork1 {
    public static void main(String[] args) {
        double a = 0, b = 0, h = 0, F1 = 0, F2 = 0, F3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a: ");
        a = sc.nextDouble();
        System.out.println();

        System.out.print("Insert b: ");
        b = sc.nextDouble();
        System.out.println();

        System.out.print("Insert h: ");
        h = sc.nextDouble();
        System.out.println();

        for (; a <= b; a += h) {
            F1 = a - Math.sin(a);
            F2 = Math.pow(Math.sin(a), 2);
            F3 = 2 * Math.cos(a) - 1;
            System.out.print("x = " + a + " ");
            System.out.print("F1 = " + F1 + " ");
            System.out.print("F2 = " + F2 + " ");
            System.out.print("F3 = " + F3 + " ");
            System.out.println();
            //String.format
        }
    }
}
