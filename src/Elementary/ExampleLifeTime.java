package Elementary;

/**
 * Created by Vlad on 24.09.2016.
 */
public class ExampleLifeTime {
    public static void main(String args[]) {
        int x;
        for(x = 0; x < 3; x++) {
            int у = -1; // у инициализируется при каждом вхождении
// в блок
            System.out.println("у равна: " + у); // эта строка всегда
// выводит значение -1
            у = 100;
            System.out.println("у теперь равна: " + у);
        }
    }
}
