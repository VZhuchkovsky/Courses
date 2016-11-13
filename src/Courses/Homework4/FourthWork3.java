package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 12.11.2016.
 */
public class FourthWork3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] marks = new int[18];


        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        for(int i = 0; i< marks.length; i++){
            marks[i] = rnd.nextInt(10);

            if(i >= 0 && i <= 5){
                System.out.println("Оценка номер " + (i + 1) + " по обязательной программе: " + marks[i]);
                sum1 += marks[i];
            }
            else if(i >= 6 && i <= 11){
                System.out.println("Оценка номер " + (i + 1) + " по короткой программе: " + marks[i]);
                sum2 += marks[i];
            }
            else{
                System.out.println("Оценка номер " + (i + 1) + " по произвольной программе: " + marks[i]);
                sum3 += marks[i];
            }
        }

        System.out.println(sum1 + " " + sum2 + " " + sum3);
        if(sum1 > sum2 && sum1 > sum3){
            System.out.println("По обязательной программе лучшие оценки.");
        }
        else if(sum2 > sum1 && sum2 > sum3){
            System.out.println("По короткой программе лучшие оценки.");
        }
        else if(sum3 > sum1 && sum3 > sum2){
            System.out.println("По произвольной программе лучшие оценки.");
        }
        else{
            System.out.println("Один из наборов оценок совпадает с другим.");
        }
    }
}
