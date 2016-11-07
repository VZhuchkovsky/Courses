package Elementary;

/**
 * Created by Vlad on 04.10.2016.
 */
public class ExampleTernary {
    public static void main(String args[]) {
        int i, k;
        i = 10;
        k = i < 0 ? - i : i; // получение абсолютного значения i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
        i = -10;
        k = i < 0 ? - i : i; // получение абсолютного значения i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}
