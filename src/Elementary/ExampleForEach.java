package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // использование стиля for-each для отображения и
// суммирования значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
