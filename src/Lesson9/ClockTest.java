package Lesson9;

public class ClockTest {

    public static void main(String[] args) throws InterruptedException {
        Clock clock=new Clock(23,11,0,true);
        Clock clock2 = new Clock(22,59,1,false);

        System.out.println(clock.toString());
        clock.tic();
        Thread.sleep(1000);
        System.out.println(clock.toString());
        clock.tic();
        Thread.sleep(1000);
        System.out.println(clock.toString());
        clock.tic();
        Thread.sleep(1000);
        System.out.println(clock.toString());
        clock.tic();
        Thread.sleep(1000);
           System.out.println(clock.convertToSeconds());
        System.out.println(clock2.convertToSeconds());
        System.out.println(clock2.isBefore(clock));
        System.out.println(clock2.timeInSecondsTo(clock));
        System.out.println(clock2.timeTo(clock));
        System.out.println(clock.toString());
        System.out.println(clock2.toString());
    }



}
