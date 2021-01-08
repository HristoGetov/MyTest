package Lesson13;

import Lesson3.MyDate;

import javax.xml.crypto.Data;

public class TestMyDateClass {
    public static void main(String[] args) {
        MyDate date= new MyDate(12,3,2021);
        MyDate date2 = date.copy();
        MyDate date3 = new MyDate(date2);
        System.out.println(date.equals(date2));
        System.out.println(date3);
        date.nextDays(20);
        System.out.println(date);
        MyDate date4=MyDate.today();
        System.out.println(date4);
        MyDate date5=new MyDate();
        System.out.println(date5);
        MyDate date6 = new MyDate(1,6,2020);
        System.out.println(date6.isBefore(date));
    }
}
