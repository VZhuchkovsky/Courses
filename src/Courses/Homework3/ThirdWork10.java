package Courses.Homework3;

/**
 * Created by Vlad on 11.11.2016.
 */
public class ThirdWork10 {
    public static void main(String[] args) {
        int a = 1, b = 4;

        int count = 0;
        int sum = 0;
        int countSum = 0;

        while(count < 10){
            if(count == 0){
                sum += a;
                System.out.println("Число номер " + (count + 1) + ": "+sum);
                countSum += sum;
                count++;
            }
            else{
                sum += b;
                System.out.println("Число номер " + (count + 1) + ": "+sum);
                countSum += sum;
                count++;
            }
        }
        System.out.println("Сумма: " + countSum);
    }
}
