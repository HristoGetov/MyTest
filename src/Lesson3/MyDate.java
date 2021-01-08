package Lesson3;

import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        day= currentDate.get(GregorianCalendar.DATE);
        month = currentDate.get(GregorianCalendar.MONTH)+1;
        year = currentDate.get(GregorianCalendar.YEAR);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayDate(){
        return getDay()+"/"+getMonth()+"/" + getYear();
    }

    public boolean isLeapYear(){
        if (year%4==0){
            return true;
        }else{
            return false;
        }
    }
    public int daysInMonth(){
        if(month==1){
            return 31;
        }else if(month==2){
            if (isLeapYear()==true){
                return 29;
            }
            return 28;
        }else if (month==3){
            return 31;
        }else if (month==4){
            return 30;
        }else if (month==5){
            return 31;
        }else if (month==6){
            return 30;
        }else if (month==7){
            return 31;
        }else if (month==8){
            return 31;
        }else if (month==9){
            return 30;
        }else if (month==10){
            return 31;
        }else if (month==11){
            return 30;
        }else if (month==12){
            return 31;
        }else{
            return 0;
        }
    }

    public String getAstroSign(){
        if(month==3 && day>=21 || month==4 && day<=19){
            return "Aries";
        }else if (month==4 && day>=20 || month==5 && day<=20){
            return "Taurus";
        }else if (month==5 && day>=21 || month==6 && day<=20){
            return "Gemini";
        }else if (month==6 && day>=21 || month==7 && day<=22){
            return "Cancer";
        }else if (month==7 && day>=23 || month==8 && day<=22){
            return "Leo";
        }else if (month==8 && day>=23 || month==9 && day<=22){
            return "Virgo";
        }else if (month==9 && day>=23 || month==10 && day<=22){
            return "Libra";
        }else if (month==10 && day>=23 || month==11 && day<=21){
            return "Scorpio";
        }else if (month==11 && day>=22 || month==12 && day<=21){
            return "Sagittarius";
        }else if (month==12 && day>=22 || month==1 && day<=19){
            return "Capricorn";
        }else if (month==1 && day>=20 || month==2 && day<=18){
            return "Aquarius";
        }else if (month==2 && day>=19 || month==3 && day<=20){
            return "Pisces";
        }
        return "Wrong date format!";
    }

    public String dayOfTheWeek(){
        int dayNumberOfTheWeek = (day+(13*(month+1)/5)+(year%100)+((year%100)/4)+((year/100)/4)+5*(year/100))%7;
         if(dayNumberOfTheWeek==0){
             return "Saturday";
         }else if (dayNumberOfTheWeek==1){
             return "Sunday";
         }else if (dayNumberOfTheWeek==2){
             return "Monday";
         }else if (dayNumberOfTheWeek==3){
             return "Tuesday";
         }else if (dayNumberOfTheWeek==4){
             return "Wednesday";
         }else if (dayNumberOfTheWeek==5){
             return "Thursday";
         }else if (dayNumberOfTheWeek==6){
             return "Friday";
         }
        return "none";
    }

    public String getMonthName(){
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "No such a month!";
        }
    }

    public void nextDay() {

        if(month==1 || month==3|| month==5||month==7||month==8 || month==10|| month==12) {
            if (day > 0 & day <=32) {
                 day++;
                   if (day == 32) {
                        month++;
                        day = 1;
                        if (month == 13) {
                            month = 1;
                            year++;
                        }
                    }

            }
        }
        else if (month==4 || month==6 || month==9 || month==11) {
            if (day > 0 && day <= 30) {
                if (day == 30) {
                    month++;
                    day = 0;
                }
                day++;
            }
        }else if (month==2) {
            if (isLeapYear()) {
                if (day > 0 && day <= 29) {
                    if (day == 29) {
                        day = 0;
                        month++;
                    }
                    day++;
                }

            } else {
                if (day > 0 && day <= 28) {
                    if (day == 28) {
                        day = 0;
                        month++;
                    }
                    day++;

                }
            }
        }
    }

    public void nextDays(int days){
        while (days>0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 0 & day <= 32) {
                    day++;
                    days--;
                    if (day == 32) {
                        month++;
                        day = 1;
                        if (month == 13) {
                            month = 1;
                            year++;
                        }
                    }

                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 0 && day <= 30) {
                    if (day == 30) {
                        month++;
                        day = 0;
                    }
                    day++;
                    days--;
                }
            } else if (month == 2) {
                if (isLeapYear()) {
                    if (day > 0 && day <= 29) {
                        if (day == 29) {
                            day = 0;
                            month++;
                        }
                        day++;
                        days--;
                    }

                } else {
                    if (day > 0 && day <= 28) {
                        if (day == 28) {
                            day = 0;
                            month++;
                        }
                        day++;
                        days--;

                    }
                }
            }
        }
    }
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(MyDate date){
        if (day==date.day && month==date.month && year==date.year){
            return true;
        }
        else {
            return false;
        }
    }
    public MyDate copy(){
        return new MyDate(day,month,year);
    }
    public MyDate(MyDate obj){
        day= obj.day;
        month=obj.month;
        year= obj.year;
    }
    public static MyDate today(){
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentDay = currentDate.get(GregorianCalendar.DATE);
        int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
        int currentYear = currentDate.get(GregorianCalendar.YEAR);
        return new MyDate(currentDay,currentMonth,currentYear);
    }
    public boolean isBefore(MyDate date2) {
        if (year > date2.year) {
         return false;
        } else if (year == date2.year && month > date2.month) {
            return false;
        }
        else if (year== date2.year && month==date2.month && day > date2.day){
            return false;
        }
        else {
            return true;
        }
    }
}
