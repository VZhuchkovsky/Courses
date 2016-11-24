package Courses.Homework6;

import java.util.Scanner;

/**
 * Created by Vlad on 22.11.2016.
 */
public class SixthWork3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите число: ");
        int n = sc.nextInt();
        FunctionD(n);
        System.out.println();

    }

    private static void FunctionD(int n) {

        System.out.println("Краткая характеристика числа " + n);

        if (n > 0) {
            System.out.println("Число положительное.");
        } else if (n < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число нулевое.");
        }

        boolean isSimpleNum = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) isSimpleNum = false;
        }

        if (n == 0 || n == 1) {
            isSimpleNum = false;
        }

        if (n == 2) {
            isSimpleNum = true;
        }

        if(isSimpleNum == true){
            System.out.println("Число простое.");
        }else{
            System.out.println("Число составное.");
        }

        if (n % 2 == 0 && n != 0) {
            System.out.println("Число делится на 2 без остатка.");
        }
        if (n % 3 == 0 && n != 0) {
            System.out.println("Число делится на 3 без остатка.");
        }
        if (n % 5 == 0 && n != 0) {
            System.out.println("Число делится на 5 без остатка.");
        }
        if (n % 6 == 0 && n != 0) {
            System.out.println("Число делится на 6 без остатка.");
        }
        if (n % 9 == 0 && n != 0) {
            System.out.println("Число делится на 9 без остатка.");
        }
    }

    //2,3,5,6,9


}


