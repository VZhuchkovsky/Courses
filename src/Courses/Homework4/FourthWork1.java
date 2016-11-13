package Courses.Homework4;

import java.util.Random;

/**
 * Created by Vlad on 12.11.2016.
 */
public class FourthWork1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] books = new int[35];

        int sum = 0;

        for(int i = 0; i< books.length; i++){
            books[i] = rnd.nextInt(6000) + 1;
            System.out.println("Кол-во книг в разделе " + (i + 1) + " составляет " + books[i]);
            sum += books[i];
        }

        System.out.println();
        System.out.println("Всего книг: " + sum);
        System.out.println();

        if((sum/100000) >= 1){
            System.out.println("Количество книг - шестизначное число.");
        }
        else{
            System.out.println("Количество книг - не шестизначное число.");
        }

    }
}
