package Courses.Homework6;

import java.util.Scanner;

/**
 * Created by Vlad on 22.11.2016.
 */
public class SixthWork1 {

    public static void main(String[] args) {

        Credit(100);

    }

    private static void Credit(int sum) {

        Scanner sc = new Scanner(System.in);
        int minPerMonth = 100;
        int wholeCreditSum = 700;
        int thisSum = 0;
        boolean while1 = true;
        boolean while2 = true;
        //boolean while3 = true;

        while (while1) {
            if (sum >= 0) {
                System.out.println("Внесённый платёж составляет " + sum + " гривен.");
            }else{
                System.out.println("Новый кредит составляет " + Math.abs(sum) + " гривен.");
            }
            thisSum += sum;
            System.out.println("Задолженность составляет " + (wholeCreditSum - thisSum));
            if (sum > minPerMonth) {
                System.out.println("Переплата в размере " + (sum - minPerMonth));
            } else if (sum < minPerMonth && sum > 0) {
                System.out.println("Недоплата в размере " + (minPerMonth - sum));
            }
            if (thisSum >= wholeCreditSum) {
                System.out.println("Кредит погашен.");
                break;
            }


            while (while2) {

                System.out.print("Ввести новые данные?(y - да,n - нет) : ");
                String answer = sc.next();

                if (answer.equals("y")) {

                    System.out.print("Введите сумму платежа : ");
                    sum = sc.nextInt();
                    break;

                } else if (answer.equals("n")) {
                    while1 = while2 = false;
                } else {
                    System.out.println("Ошибка. Повторите выбор.");
                }

            }


        }

    }

}
