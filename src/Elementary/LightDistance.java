package Elementary;

/**
 * Created by Vlad on 23.09.2016.
 */
public class LightDistance {
    public static void main(String args[]) {
        int light_speed;
        long days;
        long seconds;
        long distance;
// приблизительная скорость света в милях за секунду
        light_speed = 186000;
        days = 1000; // указание количества дней
        seconds = days * 24 * 60 * 60; // преобразование в секунды
        distance = light_speed * seconds; // вычисление расстояния
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
