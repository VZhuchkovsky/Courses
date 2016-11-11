package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork5 {
    public static void main(String[] args) {
        int l = 15;
        Scanner sc = new Scanner(System.in);

        int x[] = new int[l];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Введите элемент массива номер " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
/*
        double z[]= new double[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                z[i] += (i + x[i]) / factor(i);
            }
        }

        for (int i = 0; i < l; i++){
            System.out.println("z[" + i + "] = " + z[i]);
        }
*/

        double z = 0;

        for (int i = 0; i < l; i++){
            z += (i + x[i]) / factor(i);
        }

        System.out.println("z = " + z);

    }

    public static double factor(int i) {
        double fact = 1;
        for (int o = 1; o <= i; o++) {
            fact *= o;
        }
        return fact;
    }
}
