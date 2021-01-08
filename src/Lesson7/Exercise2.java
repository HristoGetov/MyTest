package Lesson7;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char gender = scanner.nextLine().charAt(0);
        int age =scanner.nextInt();

        if (gender!='M'|| gender != 'F' && age < 0 ){
            System.out.println("Error in typed values!");
        }else if(gender=='M' && age<18){
            System.out.println("Boy");
        }
        else if(gender=='M'&&age>=18){
            System.out.println("Man");
        }
        else if(gender=='F' && age<18){
            System.out.println("Girl");
        }else if(gender=='F'&& age>=18){
            System.out.println("Woman");
        }
    }
}
