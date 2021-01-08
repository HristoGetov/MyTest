package Lesson2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        String name,city,college,profession,animal,petName;
        int age;
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2= new Scanner(System.in);
        System.out.println("Please enter your name...");
        name=keyboard.nextLine();
        System.out.println("Please enter your age...");
        age=keyboard.nextInt();
        System.out.println("Please enter a city name...");
        city=keyboard2.nextLine();
        System.out.println("Please enter a college name...");
        college=keyboard2.nextLine();
        System.out.println("Please enter a profession...");
        profession=keyboard2.nextLine();
        System.out.println("Please enter a type of animal...");
        animal=keyboard2.nextLine();
        System.out.println("Please enter a pet name...");
        petName=keyboard2.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age+
                ",\n" + name+" went to college at " + college+". " + name + " graduated and went to work as a(n) " + profession +
                ". \nThen, " + name + " adopted a(n) " + animal+" named " + petName+". " + "\nThey both lived happily ever after!");
    }
}
