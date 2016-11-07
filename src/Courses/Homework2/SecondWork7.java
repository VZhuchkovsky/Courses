package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 06.11.2016.
 */

/*
Дано трехзначное число. Определить, какая из его цифр больше:
а) первая или последняя;
б) первая или вторая;
в) вторая или последняя.
*/


public class SecondWork7 {
    public static void main(String[] args){
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввежите трёхзначное число: ");
        number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number - hundreds*100)/10;
        int ones = (number - hundreds*100 - tens*10);

        //System.out.println(hundreds + " " + tens + " " + ones);
        if (number < 100 && number > 999) {
            System.out.println("Ошибка. Число не трёхзначное.");
        } else {

            if(hundreds > ones){
                System.out.println("Первая цифра больше последней: " + hundreds + " > " + ones);
            }
            else{
                System.out.println("Первая цифра меньше последней: " + hundreds + " < " + ones);
            }

            if(hundreds > tens){
                System.out.println("Первая цифра больше второй: " + hundreds + " > " + tens);
            }
            else{
                System.out.println("Первая цифра меньше второй: " + hundreds + " < " + tens);
            }

            if(tens > hundreds){
                System.out.println("Вторая цифра больше последней: " + tens + " > " + hundreds);
            }
            else{
                System.out.println("Вторая цифра меньше последней: " + tens + " < " + hundreds);
            }
        }

    }
}
