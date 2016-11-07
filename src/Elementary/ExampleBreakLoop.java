package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleBreakLoop {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // выход из цикла если i равно 10
            System.out.println("i : " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
