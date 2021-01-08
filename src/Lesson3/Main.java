package Lesson3;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2 = new Person();

        person1.setName("Kiro Pora");
        person1.setBirthday("12-08-1988");

        person2.setName("Haralampi");
        person2.setBirthday("22-09-1989");

        System.out.println("Name: " +person1.getName() + "\nAge: " + person1.getBirthday());
        System.out.println("\nName: " + person2.getName()+"\nAge: " + person2.getBirthday());


    }
}
