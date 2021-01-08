package Lesson2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an number...");
        int temp1 = keyboard.nextInt();
        System.out.println("Please enter another number...");
        int temp2 = keyboard.nextInt();
        System.out.println("Please enter the last number...");
        int temp3=keyboard.nextInt();
        System.out.println("Please enter the last number...");
        int temp4=keyboard.nextInt();
        System.out.println("Please enter the last number...");
        int temp5=keyboard.nextInt();
        System.out.println("Please enter the last number...");
        int temp6=keyboard.nextInt();
        System.out.println("Please enter the last number...");
        int temp7=keyboard.nextInt();

        int sum = temp1+temp2+temp3;
        int product = temp1*temp2*temp3;
        int average = (temp1+temp2+temp3+temp4+temp5+temp6+temp7)/7;
        System.out.println("The sum of the 3 entered numbers is : " + sum );
        System.out.println("The product of the 3 entered numbers is : " + product );
        System.out.println("Average: " + average);

    }
}
