package Courses;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task7 {
    public static void main(String[] args) {
        int n = 20;
        int[] H = new int[n];
        int[] D = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            H[i] = rnd.nextInt(20) + 20;
            System.out.println("Прыжки в высоту " + (i + 1) + " : " + H[i]);
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            D[i] = rnd.nextInt(20) + 20;
            System.out.println("Прыжки в длину " + (i + 1) + " : " + D[i]);
        }

        Arrays.sort(H);
        Arrays.sort(D);

        System.out.println();
        System.out.println("Лучшие прыжки в высоту : 1)" + H[n - 1] + "; 2)" + H[n - 2] + "; 3)" + H[n - 3]);
        System.out.println("Худшие прыжки в высоту : 1)" + H[0] + "; 2)" + H[1] + "; 3)" + H[2]);
        System.out.println("Лучшие прыжки в длину : 1)" + D[n - 1] + "; 2)" + D[n - 2] + "; 3)" + D[n - 3]);
        System.out.println("Худшие прыжки в длину : 1)" + D[0] + "; 2)" + D[1] + "; 3)" + D[2]);


    }

}

