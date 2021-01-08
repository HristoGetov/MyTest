package Lesson3;

import java.util.Date;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        MyDate date2=new MyDate();

        date.setDay(9);
        date.setMonth(3);
        date.setYear(1988);

        date2.setDay(30);
        date2.setMonth(12);
        date2.setYear(2020);


        System.out.println(date.displayDate());
        System.out.println(date2.displayDate());
        System.out.println(date.isLeapYear());
        System.out.println(date2.isLeapYear());
        System.out.println(date.daysInMonth());
        System.out.println(date2.daysInMonth());
        System.out.println(date.getAstroSign());
        System.out.println(date2.getAstroSign());
        System.out.println(date.dayOfTheWeek());
        System.out.println(date2.dayOfTheWeek());
        System.out.println(date.getMonthName());
        System.out.println(date2.getMonthName());

    }
}
