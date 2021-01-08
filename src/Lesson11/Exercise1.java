package Lesson11;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username...");
        String userName=scanner.nextLine();
        System.out.println("Please enter password...");
        String password = scanner.nextLine();
        System.out.println("Please enter confirmation password...");
        String confirmPass=scanner.nextLine();
        while (!password.equals(confirmPass)){
            System.out.println("Two entered passwords does not match...");
            System.out.println("Please enter the password...");
            password=scanner.nextLine();
            System.out.println("Please enter the confirmation password...");
            confirmPass=scanner.nextLine();
        }
        System.out.println(userName + ", " + password);
    }
}
