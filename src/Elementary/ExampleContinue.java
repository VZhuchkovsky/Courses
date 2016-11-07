package Elementary;

/**
 * Created by Vlad on 12.10.2016.
 */
public class ExampleContinue {
    public static void main(String args[]) {
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }
}
