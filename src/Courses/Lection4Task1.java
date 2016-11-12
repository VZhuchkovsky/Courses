package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task1 {
    public static void main(String[] args) {
        int n = 10;

        double[] Banks = new double[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            Banks[i] = rnd.nextDouble() + 25;
            System.out.println("Банк " + (i + 1) + " обладает курсом " + Banks[i]);
        }

        double min = Banks[0];
        int bestBank = 1;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (Banks[i] < min) {
                min =  Banks[i];
                bestBank = i + 1;
            }
            sum += Banks[i];
        }

        System.out.println("Min : " + min);
        System.out.println("Best Bank -> " + bestBank);
        System.out.println("Sum : " + sum);




    }
}
