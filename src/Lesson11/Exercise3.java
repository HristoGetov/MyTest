package Lesson11;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int product=0;
        Scanner scanner =new Scanner(System.in);
        while (product<=100){
            System.out.println("Please write a number less than 100...");
          int userInput=scanner.nextInt();
            product+=userInput*10;

        }
        System.out.println("The product of all the numbers you have written is: " + product);

    }


}
