package Lesson4;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(2008,"Ford",0);
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
    }
}
