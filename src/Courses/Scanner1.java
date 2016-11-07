package Courses;

import java.util.Scanner;

/**
 * Created by Vlad on 01.11.2016.
 */
public class Scanner1 {
    public static void main(String args[]) {
        int a; //square's side
        System.out.println("Input square's side: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Периметр : " + (a * 4));
        System.out.println("Площадь : " + a * a);
    }
}


