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

        for(int i = 0; i < a.length; i++){
            a[i] = rnd.nextInt(100);
            System.out.println("Элемент номер " + (i) + ": " + a[i]);
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 2; j <= 5; j++){
                if(a[i] % j == 0){
                    System.out.println("Число " + a[i] + " является простым");
                }

            }
        }

    }
}