package Courses.Homework6;

/**
 * Created by Vlad on 23.11.2016.
 */
public class SixthWork4 {

    public static void main(String[] args) {

        int[] a = {1,6,2,6,2,1,3,5,9};

        ArrayShow(a);
        BubbleSort(a);
        ArrayShow(a);

    }

    private static int[] BubbleSort(int[] a) {

        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] < a[i]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = true;
                }
            }
        }
            return a;
    }

    private static void ArrayShow(int[] a){
        for(int i : a){
            System.out.printf(" " + i);
        }
        System.out.println();
    }

}
