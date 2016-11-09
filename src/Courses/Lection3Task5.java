package Courses;

import java.util.Scanner;

/**
 * Created by Vlad on 08.11.2016.
 */
public class Lection3Task5 {
    public static void main(String[] args) {
        double a = 0, b = 0, h = 0, F1 = 0, F2 = 0;
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
            F1 = Math.tan(a);
            F2 = (1.0 / Math.tan(a)) + 1;
            System.out.print("x = " + a + " ");
            System.out.print("F1 = " + F1 + " ");
            System.out.print("F2 = " + F2 + " ");
            System.out.println();
            //String.format
        }
    }
}
