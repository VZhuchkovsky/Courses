package Courses.Homework3;

import java.util.Scanner;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork9 {
    public static void main(String[] args) {
        int a = 2, b = 4, z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите z: ");
        z = sc.nextInt();

        int count = 0;
        int sum = 0;

        while(sum < z){
            if(count == 0){
                sum += a;
                System.out.println("Число номер " + (count + 1) + ": "+sum);
                count++;
            }
            else{
                sum += b;
                System.out.println("Число номер " + (count + 1) + ": "+sum);
                count++;
            }
        }

    }
}
