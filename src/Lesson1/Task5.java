package Lesson1;

public class Task5 {
    public static void main(String[] args) {
        int firstItem = 80;
        int secondItem = 140;
        int thirdItem = 230;
        final double tax= 0.25;

        double firstItemAfterTax = (firstItem*tax)+firstItem;
        double secondItemAfterTax = (secondItem*tax)+secondItem;
        double thirdItemAfterTax = (thirdItem*tax)+thirdItem;

        System.out.println("Item 1: " + firstItemAfterTax +"\nItem 2: " + secondItemAfterTax + "\nItem 3: " + thirdItemAfterTax );

    }

}
