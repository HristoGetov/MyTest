package Lesson13;

public class StaticClassTest {
    public static void main(String[] args) {
        StaticClass obj1 = new StaticClass();
        StaticClass obj2 = new StaticClass();
        StaticClass obj3 = new StaticClass();

        obj2.setValue(7);
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj3.getValue());
    }
}
