package Lesson11;

public class Exercise4 {
    public static void main(String[] args) {
        double num1=1;
        double num2=30;
        double product=0;

        for (int i =0;i<30;i++){
            product+=(num1+i)/(num2-i);
        }
        System.out.println(product);
    }
}
