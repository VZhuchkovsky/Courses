package Elementary;

/**
 * Created by Vlad on 22.09.2016.
 */
public class ExampleStringBuilder {
    public static void main(String args[]) {
        StringBuilder s = new StringBuilder("a");
        for(int i = 0; i < 100;i++)   {
            s.append('a');
        }
        System.out.println(s);

        StringBuilder f = new StringBuilder("abcd");
        f.append('e');//abcde
        f.delete(1,2);//acde
        f.insert(1,'b');//abcde
        f.deleteCharAt(2);//abde
        String ans = f.toString();

    }
}
