package Lesson10;

import java.util.Random;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        int randomNumber= random.nextInt(1000);
        System.out.println("Guess the number...");
        int guessedNumber=scanner.nextInt();
        int count=0;

        while (randomNumber!=guessedNumber){
            if (randomNumber<guessedNumber) {
                System.out.println("Wrong number! The number should be less than " + guessedNumber);
                count++;
                guessedNumber=scanner.nextInt();
            }else{
                System.out.println("Wrong number! The number should be higher than " + guessedNumber);
                count++;
                guessedNumber=scanner.nextInt();
            }

        }
        System.out.println("Congrats, your guess was correct! Total attempts used: " + count);

    }
}
