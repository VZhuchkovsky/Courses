package Courses.Homework2;

import java.util.Scanner;

/**
 * Created by Vlad on 06.11.2016.
 */
public class SecondWork6 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        double mincost = 1.3;
        System.out.println("Вычисление стоимости разговора по телефону.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходные данные. ");
        System.out.print("Длительность разговора (целое количество минут): ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("День недели (1 — понедельник, ... 7 — воскресенье): ");
        b = scanner.nextInt();

        if (b == 6 | b == 7) {
            System.out.println("Предоставляется скидка 20%.");
            System.out.println("Стоимость разговора: " + (mincost * a * 0.8));
        } else if (b < 1 | b > 7 | a < 1) {
            System.out.println("Ошибка. Пожалуйста, укажите данные корректно.");
        } else {
            System.out.println("В рабочие дни скидка не предоставляется.");
            System.out.println("Стоимость разговора: " + mincost * a);
        }


    }
}
