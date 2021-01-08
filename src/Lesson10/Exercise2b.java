package Lesson10;
import Lesson3.MyDate;

import java.util.Scanner;

public class Exercise2b {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        Scanner scanner = new Scanner(System.in);
        int count=0;
        System.out.println("Please enter the start year..");
        int starYear = scanner.nextInt();
        System.out.println("Please enter the end year...");
        int endYear = scanner.nextInt();
        for (int i = starYear;i<endYear;i++){
            date.setYear(i);
            if (date.isLeapYear()){
                count++;
            }

        }
        System.out.println(count);
    }
}
