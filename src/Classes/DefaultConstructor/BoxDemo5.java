package Classes.DefaultConstructor;

/**
 * Created by Vlad on 14.10.2016.
 */
public class BoxDemo5 {
    public static void main(String args[]) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
        // инициализация каждого экземпляра Box
        myboxl.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
// получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем равен " + vol);
// получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
