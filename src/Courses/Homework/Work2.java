package Courses.Homework;

import java.util.Scanner;

/**
 * Created by Vlad on 04.11.2016.
 */

/*
 Написать программу, которая будет высчитывать периметр, площадь, для заданного прямоугольника.
 Ввод сторон прямоугольника производится при выполнении программы.
 */


public class Work2 {
    public static void main(String[] args){
        int length = 0, width = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину: ");
        length = scanner.nextInt();
        System.out.println("Введите ширину: ");
        width = scanner.nextInt();
        System.out.println("Периметр равен: " + (2*length + 2*width));
        System.out.println("Площадь равна: " + length * width);
    }
}
