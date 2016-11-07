package Elementary;

/**
 * Created by Vlad on 04.10.2016.
 */
public class ExampleOpBitEquals {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int с = 3;
        a |= 4;
        b >>= 1;
        с <<= 1;
        a ^= с;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("с = " + с);
    }
}
