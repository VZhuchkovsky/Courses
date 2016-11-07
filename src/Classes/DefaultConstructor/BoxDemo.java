package Classes.DefaultConstructor;

/**
 * Created by Vlad on 13.10.2016.
 */

// Этот класс объявляет объект класса Box.
public class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;
// присваивание значений переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth =15;
// вычисление объема параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
