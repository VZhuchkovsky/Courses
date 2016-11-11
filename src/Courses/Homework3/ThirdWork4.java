package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork4 {
    public static void main(String[] args) {
        int l = 20, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите k: ");
        k = sc.nextInt();

        int x[] = new int[l];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Введите элемент массива номер " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < k; j++) {
                sum += (Math.pow(x[i],k))/factor(k);
            }
        }
        System.out.println("z = " + sum);

    }

    public static double factor(int i) {
        double fact = 1;
        for (int o = 1; o <= i; o++) {
            fact *= o;
        }
        return fact;
    }
}
