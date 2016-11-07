package Elementary;

/**
 * Created by Vlad on 05.10.2016.
 */
public class ExampleStringSwitch {
    public static void main(String args[]) {
        String str = "два";
        switch(str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("нет соответствия)");
                break;
        }
    }
}
