package Lesson10;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word="";
        while(!word.equals("quit")){
            System.out.println("Please write a word....");
            word=scanner.nextLine();
            String temp="";
            int length= word.length();
            for (int i =1;i<=length;i++){
                 temp += word.charAt(length - i);
        }
            if (word.equals("quit")){
            }else {
                System.out.println(temp);
            }
    }
    }

}
