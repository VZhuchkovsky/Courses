package Elementary;

/**
 * Created by Vlad on 12.10.2016.
 */
public class ExampleReturn {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("До выполнения возврата.");
        if(t) return; // возврат к вызывающему объекту
        System.out.println("Этот оператор выполняться не будет.");
    }
}
