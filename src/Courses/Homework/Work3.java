package Courses.Homework;

import java.util.Scanner;

/**
 * Created by Vlad on 04.11.2016.
 */

/*
Написать программу, которая будет высчитывать длину стороны квадрата по периметру
(Вводим периметр – на выходе получаем длину стороны квадрата).
 */


public class Work3 {
    public static void main(String[] args){
        int per = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите периметр: ");
        per = scanner.nextInt();
        System.out.println("Сторона пквадрата равна: " + (per/4));
    }
}
