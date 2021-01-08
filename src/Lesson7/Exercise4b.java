package Lesson7;

import java.util.Scanner;

public class Exercise4b {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();

        if(number1>number2){
            System.out.println(number2 +", " + number1);
        }else if (number1<number2){
            System.out.println(number1 +", " + number2);
        }else {
            System.out.println(number2 +", " + number1);
        }
    }
}
