package ClassesConstructorParams;

/**
 * Created by Vlad on 14.10.2016.
 */
public class Box {
    double width;
    double height;
    double depth;
    // Это конструктор класса Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}
