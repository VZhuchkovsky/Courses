package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// использование цикла for для отображения и
// суммирования значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5) break; // прекращение цикла после
// получения 5 значений
        }
        System.out.println("Сумма пяти первых элементов равна: " + sum);
    }
}
