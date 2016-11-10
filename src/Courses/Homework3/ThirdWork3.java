package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 09.11.2016.
 */
public class ThirdWork3 {
    public static void main(String[] args) {
        double a = 0, b = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert number: ");
        number = sc.nextInt();
        System.out.println();
/*
        System.out.print("Insert a: ");
        a = sc.nextDouble();
        System.out.println();

        System.out.print("Insert b: ");
        b = sc.nextDouble();
        System.out.println();
*/

        //Вычисление количества цифр в числе
        int numberTest = number;
        int count = (numberTest == 0) ? 1 : 0;
        while (numberTest != 0) {
            count++;
            numberTest /= 10;
        }
        System.out.println(count);
        System.out.println();

        int digit[] = new int[count];
        int deduction = 0;

       outer: for (int i = 1; i <= count; i++) {

            if (i == 1) {

                digit[0] = (int) (number / Math.pow(10, count - i));
                deduction += digit[0] * Math.pow(10, count - i);

            } else {

                for (int j = 1; j <= count; j++) {
                    //digit[j] = (int) ((number - (digit[j - 1] * Math.pow(10, i - 1))) / Math.pow(10, i - 2));
                    //System.out.println("i = " + i);
                    digit[j] = number - deduction;
                    //System.out.println("Test i : " + (i == 2));
                    digit[j] /= Math.pow(10, i - 2); // найти ошибку

                    //System.out.println("i -> " + i);

                    deduction += (digit[j] * Math.pow(10,i - 2));

                    continue outer;


                    /*System.out.println("Deduction do: " + deduction);
                    deduction += digit[j] * Math.pow(10, i);
                    System.out.println("Deduction posle: " + deduction);
                    continue;*/
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(digit[i]);
        }

        System.out.println();
        System.out.println(digit[1]);

    }
}
