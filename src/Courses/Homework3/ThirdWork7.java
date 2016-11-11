package Courses.Homework3;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork7 {
    public static void main(String[] args) {

        int count = 0;

        for (int j = 101; ; j++) {
            if (j % 19 == 0) {
                System.out.println("Число номер " + count + ": " + j);
                count++;
            }
            if (count == 15) break;
        }
    }
}
