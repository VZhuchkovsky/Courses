package Courses.Homework3;

import java.util.Scanner;
//ДОРАБОТАТЬ
/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork6 {
    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите k (от 1 до 30): ");
        k = sc.nextInt();

        int count = 0;


        if (k < 1 || k > 30) {
            System.out.println("Ошибка. k не принадлежит интервалу от 1 до 30");
        } else {
            for (int x = 1; x <= 30; x++) {
                for (int y = 1; y <= 30; y++) {
                    if ((Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(k, 2))) {
                        System.out.println("Решение х = " + x + "; y = " + y);
                    }
                }
            }
        }
        //System.out.println(count);
    }
}
