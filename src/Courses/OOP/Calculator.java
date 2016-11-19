package Courses.OOP;

/**
 * Created by Vlad on 18.11.2016.
 */
public class Calculator {

    //Сложение
    private static int Add(int opr1, int opr2) {
        return opr1 + opr2;
    }

    //Разница
    private static int Diff(int opr1, int opr2) {
        return opr1 - opr2;
    }

    //Умножение
    private static int Mult(int opr1, int opr2) {
        return opr1 * opr2;
    }

    //Деление
    private static double Div(double opr1, double opr2) {
        return opr1 / opr2;
    }

    //Возведение в степень
    private static double Pow(int opr1, int opr2) {
        int temp = opr1;
        for (int i = 1; i < opr2; i++) {
            opr1 *= temp;
        }

        return opr1;
        //  Pow(opr1,opr2);
    }

    public static void main(String[] args) {
        int opr1 = 10;
        int opr2 = 20;

        int sum_res = Add(opr1, opr2);
        int diff_res = Diff(opr1, opr2);
        int mult_res = Mult(opr1, opr2);
        double div_res = Div(opr1, opr2);
        double pow_res = Pow(5, 4);

        System.out.println(sum_res);
        System.out.println(diff_res);
        System.out.println(mult_res);
        System.out.println(div_res);
        System.out.println(pow_res);



    }
}
