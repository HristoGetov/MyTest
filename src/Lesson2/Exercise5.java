package Lesson2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int first,second,third;
        double avarege;

        System.out.println("Please write first test score...");
        first=keyboard.nextInt();
        System.out.println("Please write second test score...");
        second=keyboard.nextInt();
        System.out.println("Please write third test score...");
        third=keyboard.nextInt();

        avarege=(first+second+third)/3;

        System.out.println("First test score: " + first+"\nSecond test score:"+second+"\nThird test score: " + third+"\nAverage: " + avarege);


    }
}
