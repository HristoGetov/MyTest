package Lesson2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first item...");
        int firstItem = keyboard.nextInt();
        System.out.println("Please enter second item...");
        int secondItem = keyboard.nextInt();
        System.out.println("Please enter last item...");
        int thirdItem = keyboard.nextInt();
        final double tax= 0.25;

        double firstItemAfterTax = (firstItem*tax)+firstItem;
        double secondItemAfterTax = (secondItem*tax)+secondItem;
        double thirdItemAfterTax = (thirdItem*tax)+thirdItem;

        System.out.println("Item 1: " + firstItemAfterTax +"\nItem 2: " + secondItemAfterTax + "\nItem 3: " + thirdItemAfterTax );

    }
}
