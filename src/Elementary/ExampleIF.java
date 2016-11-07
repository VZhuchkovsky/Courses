package Elementary;

/**
 * Created by Vlad on 21.09.2016.
 */
public class ExampleIF {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;
        if(x < y) System.out.println("x меньше у");
        x = x * 2 ;
        if(x == y) System.out.println("x теперь равна у");
        x = x * 2 ;
        if(x > y) System.out.println("x теперь больше у");

        if(x == y) System.out.println("вы не увидите это");// этот оператор не будет ничего отображать
    }
}
