package FurtherElementary;

/**
 * Created by Vlad on 20.10.2016.
 */
// В этой версии Box допускает инициализацию одного объекта другим,
public class Box2 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор.
    // Он использует объект типа Box.
    Box2(Box2 ob) { // передача объекта конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый при указании всех измерений
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни одно из изменений не указано
    Box2() {
        width = -1; // значение -1 используется для указания
        height = -1; // неинициализированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String args[]) {
// создание параллелепипедов с применением
// различных конструкторов
        Box2 myboxl = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(myboxl);
// создание копии объекта myboxl
        double vol;
// получение объема первого параллелепипеда
        vol = myboxl.volume();
        System.out.println("Объем myboxl равен " + vol);
// получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
// получение объема куба
        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);
// получение объема клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}

