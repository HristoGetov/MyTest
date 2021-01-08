package Lesson2;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("Please enter a String....");
        Scanner keyboard = new Scanner(System.in);
        String temp=keyboard.nextLine();

        System.out.println(temp.length());
        System.out.println(temp.toUpperCase());
        System.out.println(temp.toLowerCase());
        System.out.println(temp.charAt(0));
    }
}
