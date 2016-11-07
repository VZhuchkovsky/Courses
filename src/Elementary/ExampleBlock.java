package Elementary;

/**
 * Created by Vlad on 22.09.2016.
 */
public class ExampleBlock {
    public static void main(String args[]) {
        int x, y;
        y = 20;
// целевой модуль этого цикла - блок
        for (x = 0; x < 10; x++) {
            System.out.println("Значение х: " + x);
            System.out.println("Значение у: " + y);
            y = y - 2;
        }
    }
}
