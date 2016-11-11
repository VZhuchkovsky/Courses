package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork3Easy {
    public static void main(String[] args) {


        double a = 0, b = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert number: ");
        number = sc.nextInt();
        System.out.println();

        System.out.print("Insert a: ");
        a = sc.nextDouble();
        System.out.println();

        System.out.print("Insert b: ");
        b = sc.nextDouble();
        System.out.println();

        int numberTest = number;
        int count = 0;
        while (numberTest != 0) {
            count++;
            numberTest /= 10;
        }


        if (count == 5) {

            int digit[] = new int[5];

            digit[0] = (number / 10000);
            digit[1] = ((number - digit[0] * 10000) / 1000);
            digit[2] = ((number - digit[0] * 10000 - digit[1] * 1000) / 100);
            digit[3] = ((number - digit[0] * 10000 - digit[1] * 1000 - digit[2] * 100) / 10);
            digit[4] = (number - digit[0] * 10000 - digit[1] * 1000 - digit[2] * 100 - digit[3] * 10);
/*
            for (int i = 0; i < digit.length; i++) {
                System.out.println(digit[i]);
            }
*/
            int countA = 0;
            int countB = 0;

            for (int i = 0; i < digit.length; i++) {
                if (digit[i] == a) {
                    countA++;
                } else if (digit[i] == b) {
                    countB++;
                } else {
                    countA += 0;
                    countB += 0;
                }
            }

            if (countA == countB) {
                System.out.println("A и B встречаютя одинаковое кол-во раз. А = В = " + countA);
            } else if (countA > countB) {
                System.out.println("A встречается чаще В. А = " + countA + "; B = " + countB);
            } else if (countA < countB) {
                System.out.println("B встречается чаще A. А = " + countA + "; B = " + countB);
            } else {
                System.out.println("Одно или оба числа не найдены.");
            }

        } else {
            System.out.println("Error. Number is not appropriate.");
        }

    }
}
