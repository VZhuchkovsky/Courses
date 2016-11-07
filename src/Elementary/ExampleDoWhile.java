package Elementary;

/**
 * Created by Vlad on 05.10.2016.
 */
public class ExampleDoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
        System.out.println();

        int u = 10;
        do {
            System.out.println("такт " + u);
        } while (--u > 0);
    }
}
