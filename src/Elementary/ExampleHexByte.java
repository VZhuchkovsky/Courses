package Elementary;

/**
 * Created by Vlad on 01.10.2016.
 */
public class ExampleHexByte {
    static public void main(String args[]) {
        char hex[] = {
                'O', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'с', 'd', 'e', 'f'
        };
        byte b = (byte) 0xfl;
        System.out.println("b = Ox" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
