package Elementary;

/**
 * Created by Vlad on 05.10.2016.
 */
public class ExampleWhileNoBody {
    public static void main(String args[]) {
        int i, j;
        i = 100;
        j = 200;
// вычисление среднего значения i и j
        while(++i < --j) ; // в этом цикле тело цикла отсутствует
        System.out.println("Среднее значение равно " + i);
    }
}
