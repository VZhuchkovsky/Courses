package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleBreakLoop4 {
    // Использование оператора break для выхода из вложенных циклов
    public static void main(String args[]) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выход из обоих циклов
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}
