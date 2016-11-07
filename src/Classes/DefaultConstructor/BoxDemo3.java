package Classes.DefaultConstructor;

/**
 * Created by Vlad on 13.10.2016.
 */
public class BoxDemo3 {
    public static void main(String args[]) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
// присваивание значений переменным экземпляра myboxl
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
/* присваивание других значений переменным
экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9 ;
// отображение объема первого параллелепипеда
        myboxl.volumeDemo();
// отображение объема второго параллелепипеда
        mybox2.volumeDemo();
    }
}
