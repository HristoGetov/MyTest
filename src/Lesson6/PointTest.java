package Lesson6;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(20,30);
        Point point2 = new Point(40,60);
        point1.moveTo(40,80);
        System.out.println("Point1: "+ point1.toString());
        point1.move(100,200);
        System.out.println("Point1: "+point1.toString());
        point2.moveTo(200,300);
        System.out.println("Point2: " + point2.toString());
        point2.move(30,50);
        System.out.println("Point2: " + point2.toString());

        System.out.println(Math.sqrt(((point2.getX()-point1.getX())*(point2.getX()-point1.getX()))+((point2.getY())-point1.getY())*(point2.getY())-point1.getY()));

    }
}
