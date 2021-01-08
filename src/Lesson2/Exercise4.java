package Lesson2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner addressInput = new Scanner(System.in);


        String firstName,lastName,address;
        int age;
        System.out.println("Please enter your first name...");
        firstName=keyboard.nextLine();
        System.out.println("Please enter your last name...");
        lastName=keyboard.nextLine();
        System.out.println("Please enter your age...");
        age = keyboard.nextInt();
        System.out.println("Please enter your address...");
        address= addressInput.nextLine();


        System.out.println("Full name: " + firstName+ " " + lastName + "\nAge: " +age +"\nAddress: " + address);

    }
}
