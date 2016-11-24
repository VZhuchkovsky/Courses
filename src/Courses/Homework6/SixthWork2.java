package Courses.Homework6;

import java.util.Scanner;

/**
 * Created by Vlad on 22.11.2016.
 */
public class SixthWork2 {

    public static void main(String[] args) {

        ConverterV();

    }

    private static void ConverterV() {
        System.out.println("Конвертер валют.");
        System.out.print("Введите сумму в гривнах: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();

        sum /= 25.78;

        System.out.println("Сумма в долларах: " + sum);
    }

}
