package Courses;

import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task6 {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[][] a = new double[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10) - 5;
                System.out.printf("%.2f\t", a[i][j]);
            }
            System.out.println();
        }

        double sumNechet[] = new double[a[0].length];
        int countPolozhit = 0;
        int countKrat = 0;
        int b = 3;
        int c = 5;

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if ((a[i][j] % 2) != 0) {
                    sumNechet[j] += a[i][j];
                }

                if (a[i][j] > 0) {
                    countPolozhit++;
                }

                if (((a[i][j] % b == 0) || (a[i][j] % c == 0)) && a[i][j] != 0){
                    countKrat++;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(" " + sumNechet[i]);
        }
        System.out.println();
        System.out.println(countPolozhit);
        System.out.println(countKrat);
    }
}
