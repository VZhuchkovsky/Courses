package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 14.11.2016.
 */
public class FourthWork7 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(20) + 1;
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }

        System.out.println();

        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if(i!= j && a[i] == a[j]){
                    a[j] = 0;
                }
            }
        }


        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + a[i]);
        }
    }
}
