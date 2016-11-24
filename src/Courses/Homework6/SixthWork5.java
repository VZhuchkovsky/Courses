package Courses.Homework6;

/**
 * Created by Vlad on 23.11.2016.
 */
public class SixthWork5 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};
        int b = 4;

        double[] c = {5.2,2.8,4.3,5.1,5.6,6.2,7,8.9,9};
        double d = 5.6;

        boolean result1 = Method5(a,b);
        boolean result2 = Method5(c,d);

        System.out.println(result1);
        System.out.println(result2);

    }

    private static boolean Method5(int[] a, int b){

        boolean flag = false;

        for(int h : a){
            if(h == b) flag = true;
        }

        return flag;
    }

    private static boolean Method5(double[] a, double b){

        boolean flag = false;

        for(double h : a){
            if(h == b) flag = true;
        }

        return flag;
    }

}
