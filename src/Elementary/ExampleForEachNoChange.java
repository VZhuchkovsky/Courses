package Elementary;

/**
 * Created by Vlad on 07.10.2016.
 */
public class ExampleForEachNoChange {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // этот оператор не оказывает никакого
                       // влияния на массив nums
        }
        System.out.println();
        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}
