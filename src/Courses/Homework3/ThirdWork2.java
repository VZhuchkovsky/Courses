package Courses.Homework3;

/**
 * Created by Vlad on 09.11.2016.
 */
public class ThirdWork2 {
    public static void main(String[] args) {


        double a = 3, b = -5, y = 0;

        for (double x = 1; x <= 5; x += 0.5) {
            y = a*Math.pow(x,2) + b;
            System.out.println("При а = 3, b = -5, х = " + x + "  Функция у принимает значение = " + y);
        }
    }

}
