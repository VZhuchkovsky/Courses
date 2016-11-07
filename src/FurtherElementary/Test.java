package FurtherElementary;

/**
 * Created by Vlad on 20.10.2016.
 */
public class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    // возврат значения true, если параметр о равен вызывающему объекту
    boolean equals(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
class PassOb {
    public static void main(String args[]) {
        Test obi = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("obi == ob2: " + obi.equals(ob2));
        System.out.println("obi == ob3: " + obi.equals(ob3));
    }
}
