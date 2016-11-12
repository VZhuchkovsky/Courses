package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task2 {
    public static void main(String[] args) {
        int n = 10;
        int m[] = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            m[i] = rnd.nextInt(20);
            System.out.println("Result : " + m[i]);
        }

        // int[] pow = {0,1,2,3,4};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i] == Math.pow(2, j)) {
                    System.out.println("Res -> " + m[i]);
                }
            }
        }




    }
}
