package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        Random rnd = new Random();

        for(int i = 0; i < m.length; i++){
            m[i] = rnd.nextInt(30);
        }

        int sum = 0;

        for(int i = 0; i < m.length; i++) {
            if ((m[i] % 2) == 0){
                sum += m[i];
                System.out.println("Четный -> " + m[i]);
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
