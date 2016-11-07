package Elementary;

/**
 * Created by Vlad on 24.09.2016.
 */
public class ExampleDynInit {
    public static void main(String args[]) {
        double a = 3.0, b = 4.0;
// динамическая инициализация переменной с
        double с = Math.sqrt(a * a + b * b) ;
        System.out.println("Гипотенуза равна " + с);
    }
}
