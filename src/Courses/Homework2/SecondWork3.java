package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 05.11.2016.
 */
public class SecondWork3 {
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("Вычисление стоимости покупки с учётом скидки.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму покупки и нажмите <Enter>");
        sum = scanner.nextDouble();
        if (sum > 500 && sum <= 1000){
            sum *= 0.97;
            System.out.println("Вы получаете скидку в размере 3%.");
            System.out.println("Сумма покупки с учётом скидки: " + sum + "руб.");
        }
        else if (sum > 1000){
            sum *= 0.95;
            System.out.println("Вы получаете скидку в размере 5%.");
            System.out.println("Сумма покупки с учётом скидки: " + sum + "руб.");
        }
        else{
            System.out.println("Потрачено.Скидка не получена.");
            System.out.println("Счёт: " + sum);

        }
    }
}
