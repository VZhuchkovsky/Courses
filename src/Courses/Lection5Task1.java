package Courses;


import java.util.Random;

/**
 * Created by Vlad on 15.11.2016.
 */
public class Lection5Task1 {
    public static void main(String[] args) {

        Random rnd = new Random();

        double[][] a = new double[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextDouble() + rnd.nextInt(10);
                System.out.printf("%.2f\t", a[i][j]);
            }
            System.out.println();
        }

        double max = a[0][0];
        double min = a[0][0];
        int f1 = 0, f2 = 0, d1 = 0, d2 = 0;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    f1 = i;
                    f2 = j;
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                    d1 = i;
                    d2 = j;
                }
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент находится в строке " + f1 + "; столбце " + f2 + " = " + max);
        System.out.println("Минимальный элемент находится в строке " + d1 + "; столбце " + d2 + " = " + min);


    }
}
