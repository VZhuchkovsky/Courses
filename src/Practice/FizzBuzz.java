package Practice;


import java.util.Scanner;
//Чекнуть версию Cono
/**
 * Created by Vlad on 22.10.2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        //FizzBuzz(100);
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("fizzbuzz ");
        n = sc.nextInt();
        FizzBuzz(n);
    }

    public static String FizzBuzz(int n) {

        String[] fb = new String[n];

        for (int i = 0; i < n; i++) {
            if (i%5==0 & i%3==0){
                //fb[i] = "FizzBuzz";
                System.out.print("FizzBuzz");
            }
            else if (i%3==0) {
                //fb[i] = "Fizz";
                System.out.print("Fizz");
            }
            else if (i%5==0){
                //fb[i] = "Buzz";
                System.out.print("Buzz");
            }
            else {//fb[i] = Integer.toString(i);
                System.out.print(i);}
            System.out.println();
        }
        return fb[n - 1];
    }
}
