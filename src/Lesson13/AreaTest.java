package Lesson13;

public class AreaTest {
    public static void main(String[] args) {
        double circle =Area.calculate(3.0);
        int rectangle = Area.calculate(2,5);
        double cylinder = Area.calculate(2,5.1);
        System.out.println("Area of the circle is : " + circle + "\nArea of the rectangle is: " + rectangle + "\nArea of the cylinder is: "+ cylinder);
    }
}
