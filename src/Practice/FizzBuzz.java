package Practice;


/**
 * Created by Vlad on 22.10.2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        /*
        int max = 100;
        if(args.length > 0){
            max = Integer.parseInt(args[0]);
        }
        for(int i = 1; i <= max; i++){
            System.out.println(FizzBuzz(i));
        }
        */
        FizzBuzz(100);
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
