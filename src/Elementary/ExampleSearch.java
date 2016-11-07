package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleSearch {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        // использование цикла for в стиле for-each для
        // поиска в nums значения val
        for(int x : nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Значение найдено!");
    }
    }
