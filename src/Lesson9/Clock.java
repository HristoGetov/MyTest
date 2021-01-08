package Lesson9;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    private boolean timeFormat24;

    public Clock(int hour, int minute, int second,boolean timeFormat24) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.timeFormat24=timeFormat24;

    }

    public Clock(int totalTimeInSeconds,boolean timeFormat24){
        if (totalTimeInSeconds>60){
            minute=totalTimeInSeconds/60;
            second=totalTimeInSeconds-(minute*60);
            if(minute>60){
                hour=minute/60;
                minute=minute-(hour*60);
            }
        }
        else{
            hour=0;
            minute=0;
            second=totalTimeInSeconds;
        }
        this.timeFormat24=timeFormat24;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void tic(){
        second+=1;
    }

    public int convertToSeconds(){
       int tempMinute=minute+(hour*60);
        int totalSeconds=second + (tempMinute*60);
        return totalSeconds;
    }

    public boolean isBefore(Clock time){
        if (this.convertToSeconds() > time.convertToSeconds()){
            return false;
        }else {
            return true;
        }
    }
    public int timeInSecondsTo(Clock time){
        if (time.convertToSeconds()>this.convertToSeconds()){
            return time.convertToSeconds()-this.convertToSeconds();
        }else {
            return this.convertToSeconds()-time.convertToSeconds();
        }
    }

    public Clock timeTo(Clock time){

        if (time.convertToSeconds()>this.convertToSeconds()){
            Clock resultInSeconds = new Clock(time.convertToSeconds()-this.convertToSeconds(),true);
            return resultInSeconds;
        }else {
            Clock result= new Clock(this.convertToSeconds()-time.convertToSeconds(),true);
            return result;
        }
    }

    public boolean isTimeFormat24() {
        return timeFormat24;
    }

    public void setTimeFormat24(boolean timeFormat24) {
        this.timeFormat24 = timeFormat24;
    }


    @Override
    public String toString() {
        if(timeFormat24==true){
            return "h=" + hour + ", m=" + this.minute + ", s=" + second ;
        }else{
            if (hour>=1 && hour<=12){
                return "h=" + hour + ", m=" + this.minute + ", s=" + second + " AM";
            }else if (hour==13){
                return "h=" + 1 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==14){
                return "h=" + 2 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==15){
                return "h=" + 3 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==16){
                return "h=" + 4 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==17){
                return "h=" + 5 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==18){
                return "h=" + 6 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==19){
                return "h=" + 7 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==20){
                return "h=" + 8 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==21){
                return "h=" + 9 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==22){
                return "h=" + 10 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==23){
                return "h=" + 11 + ", m=" + this.minute + ", s=" + second + " PM";
            }else if (hour==24){
                return "h=" + 12 + ", m=" + this.minute + ", s=" + second + " PM";
            }
            else {
                return "Wrong format!";
            }
        }

    }
}
