package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 12.11.2016.
 */
public class FourthWork4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double[] a = new double[10];

        int sequence = 0;
        int maxSequence = 0;

        for(int i = 0; i < a.length; i++) {
            a[i] = rnd.nextDouble() + rnd.nextInt(10) - 3;
            System.out.println(a[i]);

            if(a[i] > 0){
                sequence++;

                if(sequence > maxSequence){
                    maxSequence = sequence;
                }

            }
            else{
                sequence = 0;
            }
        }

        System.out.println(maxSequence);
    }
}
