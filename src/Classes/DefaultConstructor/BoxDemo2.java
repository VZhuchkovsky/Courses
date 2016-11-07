package Classes.DefaultConstructor;

/**
 * Created by Vlad on 13.10.2016.
 */
public class BoxDemo2 {
    public static void main(String args[]) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
// присваивание значений переменным экземпляра myboxl
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
/* присваивание других значений переменным
        экземпляра mybox2's */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9 ;
// вычисление объема первого параллелепипеда
        vol = myboxl.width * myboxl.height * myboxl.depth;
        System.out.println("Объем равен " + vol);
// вычисление объема второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
