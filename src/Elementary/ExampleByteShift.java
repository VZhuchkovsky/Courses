package Elementary;

/**
 * Created by Vlad on 01.10.2016.
 */
public class ExampleByteShift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;
        i = a << 2 ;
        b = (byte) (a << 2);
        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
