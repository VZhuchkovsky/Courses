package Elementary;

/**
 * Created by Vlad on 27.09.2016.
 */
public class ExampleTwoDArray {
    public static void main(String args[]) {
        int twoD[][]= new int[4] [5];
        int i , j , k = 0;
        for(i=0; i<4; i++)
            for(j=0; j<5; j++) {
                twoD[i][j] = k ;
                k++;
            }
        for(i=0; i<4; i++) {
            for(j=0; j <5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
