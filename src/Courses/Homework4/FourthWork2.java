package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 12.11.2016.
 */
public class FourthWork2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] marks = new int[10];
        int needed = 5;

        double sum = 0;

        for(int i = 0; i< marks.length; i++){
            marks[i] = rnd.nextInt(10);
            System.out.println("Кол-во баллов в соревновании " + (i + 1) + " составляет " + marks[i]);
            sum += marks[i];
        }

        double average = sum/marks.length;

        System.out.println();
        System.out.println("Средний балл составляет " + average);

        if(average >= needed){
            System.out.println("Спортсмен проходит на следующий этап.");
        }
        else{
            System.out.println("Спортсмен не проходит на следующий этап.");
        }




    }
}
