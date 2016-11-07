package FurtherElementary;

/**
 * Created by Vlad on 20.10.2016.
 */
/* В этом примере класс Box определяет три конструктора для
инициализации размеров параллелепипеда различными способами.
*/
public class Box {
    double width;
    double height;
    double depth;
    // конструктор, используемый при указании всех измерений
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // конструктор, используемый, когда ни один из размеров не указан
    Box () {
        width = -1; // значение -1 используется для указания
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }
    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    // вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}
class OverloadCons {
    public static void main(String args[]) {
// создание параллелепипедов с применением различных
// конструкторов
        Box myboxl = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
// получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем myboxl равен " + vol);
// получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
// получение объема куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
