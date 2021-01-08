package Lesson9;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 10...");
        int randomNumber = random.nextInt(10);
        int userInput=scanner.nextInt();

        if(randomNumber==userInput){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong number! The right number was: " + randomNumber);
        }

    }
}
