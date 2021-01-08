package Lesson8;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmationPassword = scanner.nextLine();

        if (password.equals(confirmationPassword)){
            System.out.println(username);
            System.out.println("Passwords are matching!");
        }else {
            System.out.println(username);
            System.out.println("Passwords are NOT matching!");
        }
    }
}
