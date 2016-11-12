package Courses;

/**
 * Created by Vlad on 12.11.2016.
 */
public class Lection4Task8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] c = new int[a.length];

        for (int i = 0, j = a.length - 1 ; i < a.length && j >= 0; i++, j--) {
            c[i] = a[j];
            System.out.println(c[i]);
        }
    }
}
