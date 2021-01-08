package Lesson4;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Book b1 = new Book(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextInt());
        Book b2 = new Book(scanner2.nextLine(),scanner2.nextLine(),scanner2.nextDouble(),scanner2.nextInt());

        b1.setPrice(b1.getPrice()-(b1.getPrice()*0.02));
        b2.setPrice(b2.getPrice()-(b2.getPrice()*0.02));
        System.out.println(b1);
        System.out.println(b2);
    }
}
