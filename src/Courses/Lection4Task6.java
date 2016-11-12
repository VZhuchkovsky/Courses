package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task6 {
    public static void main(String[] args) {
        int n = 20;
        Random rnd = new Random();
        int[] R = new int[n];
        int[] P = new int[n];
        int[] Z = new int[n];

        for (int i = 0; i < n; i++) {
            R[i] = rnd.nextInt(150) - 50;
            System.out.println("Элемент массива расходов " + (i + 1) + " : " + R[i]);
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            P[i] = rnd.nextInt(150) - 50;
            System.out.println("Элемент массива поступлений " + (i + 1) + " : " + P[i]);
        }

        System.out.println();

        int sum = 0;
        int goodDays = 0;

        for (int i = 0; i < n; i++) {
            Z[i] = P[i] + R[i];
            System.out.println("Элемент массива прибыли " + i + " : " + Z[i]);
            sum += Z[i];

            if (Z[i] > 0) {
                goodDays++;
            }
        }


        System.out.println();
        System.out.println("Сумма прибыли --> " + sum);
        System.out.println();
        System.out.println("Дни с положительной прибылью : " + goodDays);

        System.out.println();
        int max = Z[0];
        int min = Z[0];
        int max_pos = 1;
        int min_pos = 1;

        for (int i = 0; i < n; i++) {
           if(Z[i] > max){
               max  = Z[i];
               max_pos = i;
           }
            else if(Z[i] < min){
               min = Z[i];
               min_pos = i;
           }
        }
        System.out.println("Наиболее эффективный день - " + max_pos + " с прибылью " + max);
        System.out.println("Чёрный день - " + min_pos + " с прибылью " + min);
    }
}

