package Practice;

import java.util.Random;
import java.lang.*;


/**
 * Created by Vlad on 18.11.2016.
 */
public class Test {

     private static void Recursion(int counter) {
        counter--;
        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            Recursion(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {
        Recursion(3);
    }

}


