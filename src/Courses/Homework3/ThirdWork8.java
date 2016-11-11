package Courses.Homework3;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork8 {
    public static void main(String[] args) {

        int count = 0;

        for (int j = 501; ; j++) {
            if ((j % 13 == 0) || (j % 17 == 0)) {
                System.out.println("Число номер " + count + ": " + j);
                count++;
            }
            if (count == 20) break;
        }
    }
}

