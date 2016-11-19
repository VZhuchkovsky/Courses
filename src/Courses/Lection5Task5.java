package Courses;

import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task5 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[][] a = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(5);
                System.out.printf(" " +  a[i][j]);
            }
            System.out.println();
        }

        int max = a[0][0];
        int min = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
             if(a[i][j] > max) max = a[i][j];
                if(a[i][j] < min) min = a[i][j];
            }
        }

        int countMax = 0;
        int countMin = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == max) countMax++;
                if(a[i][j] == min) countMin++;
            }
        }

        System.out.println();
        System.out.println("Кол-во максимальных: " + countMax);
        System.out.println("Кол-во минимальных: " + countMin);
    }
}
