package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task4 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Random rnd = new Random();

        for(int i = 0; i < m.length; i++){
            m[i] = rnd.nextInt(40) + 1;
        }

        int x = 1;

        for(int i = 0; i < m.length; i++) {
            if ((m[i] % 9) == 0){
                x *= m[i];
                System.out.println("Кратен 9 -> " + m[i]);
            }
        }
        System.out.println("Произведение = " + x);
    }

    }
