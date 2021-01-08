package Lesson10;

import Lesson3.MyDate;

public class Exercise3 {
    public static void main(String[] args) {
        MyDate date=new MyDate(9,3,1988);
        date.setDay(9);
        date.setMonth(3);
        date.setYear(1988);
        int count=0;

        MyDate date1 = new MyDate(28,2,1991);
        date1.setDay(31);
        date1.setMonth(12);
        date1.setYear(2020);


        while(date.getYear()<date1.getYear()){
           while(date.getMonth()<date1.getMonth()){
                while(date.getDay()<date.daysInMonth()){
                    date.nextDay();
                    count++;

                }
                date.nextDay();
                count++;
            }
           date.nextDay();
           count++;
        }

        System.out.println(count);
        date1.nextDay();
        System.out.println(date1.getDay() + "/"+ date1.getMonth()+ "/" + date1.getYear());
        System.out.println(date.getDay()+ "/" + date.getMonth() + "/" + date.getYear());
    }
}
