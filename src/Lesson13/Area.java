package Lesson13;

public class Area {
    public static double calculate(double r){
            return Math.PI*(r*r);
    }
    public static int calculate(int width,int length){
        return width*length;
    }
    public static double calculate(int r,double h){
        return  Math.PI*(r*r)*h;
    }
}
