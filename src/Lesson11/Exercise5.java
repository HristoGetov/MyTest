package Lesson11;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number bigger than 0....");
        int number = scanner.nextInt();
        int sum =0;
        if (number<=0){
            System.out.println("The number should be positive and bigger than 0..." + "\nEnter new number...");
            number=scanner.nextInt();
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
        }else {
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
