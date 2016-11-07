package Elementary;

/**
 * Created by Vlad on 21.09.2016.
 */
public class Variables {
    public static void main(String args[]) {
        int num; // эта строка объявляет переменную по имени num
        num = 100; // эта строка присваивает переменной num значение 100
        System.out.println("Это переменная num: " + num);
        num = num * 2;
        System.out.print("Значение переменной num * 2 равно ");
        System.out.println(num);

        if(num > 100) { //пример работы управляющего оператора if
            System.out.println("num больше 100");
        }


    }

}
