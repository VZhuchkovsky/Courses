package Courses.Homework4;

import java.util.Random;
import java.util.Scanner;
/*
Заменить нулями :
а) все отрицательные элементы;
б) все элементы, большие данного числа n;
в) все элементы, начиная с n1-го по n2-й (n1 ≤ n2).
 */

/**
 * Created by Vlad on 14.11.2016.
 */
public class FourthWork8 {
    public static void main(String[] args) {
        int n = 0, n1 = 0, n2 = 0;
        int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите n: ");
        n = sc.nextInt();
        System.out.println();

        System.out.print("Введите n1: ");
        n1 = sc.nextInt();
        System.out.println();

        System.out.print("Введите n2: ");
        n2 = sc.nextInt();
        System.out.println();


        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(20) - 10;
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }

        if(n1 < n2) {
        for (int i = 0; i < a.length; i++) {
                if (a[i] < 0 || a[i] > n || (i >= n1 && i <= n2)) {
                    a[i] = 0;
                }
            }
        }else{
            System.out.println();
            System.out.println("n1 >= n2");
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }
    }
}

