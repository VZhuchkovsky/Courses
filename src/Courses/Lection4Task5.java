package Courses;

import java.util.Random;

/**
 * Created by Vlad on 11.11.2016.
 */
public class Lection4Task5 {
    public static void main(String[] args) {
        int treeLength = 500;
        int roadToHeaven = 0;
        int a = 490;

        int[] days = new int[30];

        Random rnd = new Random();

        for(int i = 0; i < days.length; i++){
            days[i] = rnd.nextInt(2);
            System.out.print("Day " + i);
            if(days[i] == 1){
                System.out.println(" пасмурный.");
                roadToHeaven -= 1;
            }
            else {
                System.out.println(" ясный.");
                roadToHeaven += 2;
            }
        }

        if((a + roadToHeaven) > 500){
            System.out.println();
            System.out.println("Улитка в раю.");
        }
        else {
            System.out.println();
            System.out.println("Пройденная дорога : " + (a + roadToHeaven));
        }
    }
}
