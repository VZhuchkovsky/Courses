package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleBreakPoint {
    // Использование оператора break в качестве цивилизованной формы оператора goto.
    public static void main(String args[]) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
