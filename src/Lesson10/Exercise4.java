package Lesson10;

public class Exercise4 {
    public static void main(String[] args) {
        int number=0;
        for (int i =0;i<=20;i++){
            if (i==0 || i==1){
                number=1;
                System.out.println("Fibonacci (" + i + ") = " + number);
            }
            else {
                number = i + i - 1;
                System.out.println("Fibonacci (" + i + ") = " + number);
            }
        }
    }
}
