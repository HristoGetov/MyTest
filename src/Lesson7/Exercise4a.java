package Lesson7;

import java.util.Scanner;

public class Exercise4a {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2=scanner.nextInt();

        if(number1>number2){
            System.out.println(number2);
        }else if(number1<number2){
            System.out.println(number1);
        }else {
            System.out.println("Numbers are equal!");
        }
    }
}
