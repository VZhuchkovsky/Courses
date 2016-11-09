package Courses;

import java.util.Scanner;

/**
 * Created by Vlad on 08.11.2016.
 */
public class Lection3Task4 {
    public static void main(String[] args) {


        double x = 0;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert x: ");
        x = sc.nextInt();
        System.out.println();
/*
        for (int i = 3; i <= 13; i += 2)
            for (int j = 1; j <= 6; j++) {
                double sum1 = 0;
                sum1 += Math.pow(-1, j) * ((Math.pow(x, i)) / factor(i));

                sum2 = x - sum1;

                System.out.println("Результат: " + sum2);
            }
    }
    */

        for (int i = 1; i <= 7; i++) {
            if (i % 2 == 0) {
                sum -= Math.pow(x, i * 2 - 1) / factor(i * 2 - 1);
            } else {
                sum += Math.pow(x, i * 2 - 1) / factor(i * 2 - 1);
            }
        }
        System.out.println(sum);
    }

    public static double factor(int i) {
        double fact = 1;
        for (int o = 1; o <= i; o++) {
            fact *= o;
        }
        return fact;
    }
}







