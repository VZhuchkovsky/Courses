package Courses;

import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task7 {
    public static void main(String[] args) {
        Random rnd = new Random();
/*
        int[][] a = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10);
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
     */
        int[][] a = new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}, {5, 5, 5, 5}, {6, 6, 6, 6}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j < a[i].length; j++) {

                        int temp = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = temp;

                }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}


