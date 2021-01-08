package Lesson10;

import Lesson3.MyDate;

public class Exercise2a {
    public static void main(String[] args) {
        MyDate date = new MyDate(1,1,1582);
        int count=0;
        for (int i = 1582;i<2020;i++){
            date.setYear(i);
            if (date.isLeapYear()){
                count++;
            }

        }
        System.out.println(count);
    }
}
