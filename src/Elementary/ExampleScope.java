package Elementary;

/**
 * Created by Vlad on 24.09.2016.
 */
public class ExampleScope {
    public static void main(String args[]) {
        int x; // эта переменная известна всему коду внутри метода main
        x = 10;
        if(x == 10) { // начало новой области видимости,
            int у = 20; // известной только этому блоку
// и х , и у известны в этой области видимости.
            System.out.println("х и у: " + x + " " + у) ;
            x = у * 2 ;
        }
// у = 100; // Ошибка! у не известна в этой области видимости
// переменная х известна и здесь.
        System.out.println("х равна " + x);
    }
}
