package Elementary;

/**
 * Created by Vlad on 05.10.2016.
 */
public class ExampleForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;
        i = 0 ;
        for( ; !done; ) {
            System.out.println ("i равно " + i) ;
            if ( i == 10) done = true;
            i ++;
        }
    }
}
