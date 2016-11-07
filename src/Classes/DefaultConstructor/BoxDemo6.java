package Classes.DefaultConstructor;

/**
 * Created by Vlad on 14.10.2016.
 */
public class BoxDemo6 {
    public static void main(String args[]) {
// объявление, резервирование и инициализация объектов Box
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
// получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем равен " + vol);
// получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
