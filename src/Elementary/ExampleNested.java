package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleNested {
    public static void main(String args[]) {
        int i, j;
        for(i=0; i<10; i++) {
            for(j =i; j <10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
