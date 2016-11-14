package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 14.11.2016.
 */
public class FourthWork6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(20) + 1;
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }

        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println();
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        System.out.println();

        for (int i = 0; i < a.length; i++) {

            if (max == a[i]) {
                a[i] = 0;
            }

            if (min == a[i]) {
                a[i] = 0;
            }

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }

    }
}
