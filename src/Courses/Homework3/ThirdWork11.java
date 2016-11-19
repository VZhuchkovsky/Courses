package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork11 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите n: ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("O");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("O");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){

            }
        }


    }
}


