package FurtherElementary;

/**
 * Created by Vlad on 20.10.2016.
 */
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Проверка перегрузки на наличие одного целочисленного параметра.
  void test(int a) {
        System.out.println("а: " + a);
    }
    // Проверка перегрузки на наличие двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("а и b: " + a + " " + b);
    }

    //Проверка перегрузки на наличие параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование test(double) a: " + a);
    }

    void test(int a, double b) {
        System.out.println("First int");
    }

    void test(double a, int b) {
        System.out.println("First double");
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
// вызов всех версий метода test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(2,2.3);
        ob.test(2.3,2);
        //ob.test(123.5);
        ob.test(i);
    }
}

