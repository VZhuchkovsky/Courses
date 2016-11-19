package Courses;

import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[][] a = new double[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextDouble() + rnd.nextInt(10) - 5;
                System.out.printf("%.2f\t", a[i][j]);
            }
            System.out.println();
        }

        double[] sum1 = new double[a[0].length];
        double[] sum2 = new double[a[0].length];

        //rows
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum1[i] += Math.abs(a[i][j]);
            }
        }

        //columns
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                sum2[j] += Math.abs(a[i][j]);
            }
        }


        double max1 = sum1[0];
        int indexRow = 0;
        double max2 = sum1[0];
        int indexColumn = 0;

        for (int i = 0; i < a.length; i++) {
            if (sum1[i] > max1) {
                max1 = sum1[i];
                indexRow = i;
            }

            if (sum2[i] > max2) {
                max2 = sum2[i];
                indexColumn = i;
            }
        }

        System.out.println();
        System.out.println("Max sum in row " + indexRow + " = " + max1);
        System.out.println("Max sum in column " + indexColumn + " = " + max2);

    }
}
