package Elementary;

/**
 * Created by Vlad on 24.09.2016.
 */
public class ExampleChar {
    public static void main(String args[]) {
        char chi, ch2;
        chi = 88; // код переменной X
        ch2 = 'Y';
        System.out.print("chi и ch2: ");
        System.out.println(chi + " " + ch2) ;

        char ch1;
        ch1 = 'X';
        System.out.println("chi содержит " + ch1);
        ch1++; // увеличение значения chi на единицу
        System.out.println("chi теперь " + ch1);
    }
}
