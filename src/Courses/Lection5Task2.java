package Courses;

import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[][] a = new double[15][15];

        double sumDiag = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextDouble() + rnd.nextInt(10);
                System.out.printf("%.2f\t", a[i][j]);

                if(i == j){
                    sumDiag += a[i][j];
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Сумма элементов на диагонали = " + sumDiag);


    }
}
