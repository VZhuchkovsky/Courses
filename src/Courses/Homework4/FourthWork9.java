package Courses.Homework4;

import java.util.Random;
/*
Дан массив целых чисел. Удалить из него:
а) все четные элементы, стоящие на нечетных местах;
б) все элементы, кратные 3 или 5.
 */

/**
 * Created by Vlad on 14.11.2016.
 */
public class FourthWork9 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(20) + 1;
            System.out.println("Element " + (i) + ": " + a[i]);
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {

            if (((a[i] % 2) == 0) && ((i % 2) != 0)) {
                a[i] = 0;
            }
            if ((a[i] % 3 == 0) || (a[i] % 3 == 0)) {
                a[i] = 0;
            }

        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + (i) + ": " + a[i]);
        }


    }
}
