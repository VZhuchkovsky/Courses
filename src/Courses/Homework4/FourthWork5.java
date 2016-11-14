package Courses.Homework4;

import java.util.Random;
//ДОРАБОТАТЬ

/**
 * Created by Vlad on 12.11.2016.
 */
public class FourthWork5 {
    public static void main(String[] args) {
        int n = 30;
        Random rnd = new Random();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
            System.out.println("Элемент номер " + (i + 1) + ": " + a[i]);
        }

        System.out.println();

        for (int i = 0; i < a.length; i++){
            if(IsSimpleNum(a[i]) == false){
                System.out.println("Элемент номер " + (i + 1) + " равный: " + a[i] + " является простым числом.");
            }
        }

    }

    private static boolean IsSimpleNum(int a) {
        if(a == 2){
            return true;
        }
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return true;
            }
            return false;
        }
    }

}

