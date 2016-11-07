package Classes.DefaultConstructor;

/**
 * Created by Vlad on 13.10.2016.
 */
class Box {
    double width;
    double height;
    double depth;

    void volumeDemo() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Это конструктор класса Box.
    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
}
