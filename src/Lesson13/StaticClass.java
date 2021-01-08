package Lesson13;

public class StaticClass {

    private static  int value;
    public void setValue(int value){
        this.value=value;
    }

    public static int getValue() {
        return value;
    }
}
