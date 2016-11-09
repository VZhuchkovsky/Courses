package Courses;

/**
 * Created by Vlad on 08.11.2016.
 */
public class Lection3Task1 {
    public static void main(String[] args) {
        int a = 12345679;
        int x  = 9;

        for(int i = 1; i < 10; i++){
            int s = x * i;
            System.out.println("Вот так вот: " + a + " * " + s + " = " + (a*s));

        }
    }
}
