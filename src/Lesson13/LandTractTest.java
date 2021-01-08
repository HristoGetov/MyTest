package Lesson13;

import java.util.Scanner;

public class LandTractTest {
    public static void main(String[] args) {
        LandTract tract1 = new LandTract();
        LandTract tract2 = new LandTract();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of first Land Tract...");
        tract1.setLength(scanner.nextInt());
        System.out.println("Enter the height of the first Land Tract...");
        tract1.setHeight(scanner.nextInt());
        System.out.println("Enter the length of the second Land Tract...");
        tract2.setLength(scanner.nextInt());
        System.out.println("Enter the height of the second Land Tract...");
        tract2.setHeight(scanner.nextInt());

        System.out.println("First land tract area is : " + tract1.area());
        System.out.println("Second land tract area is : " + tract2.area());
        if (tract1.equals(tract2)==true){
            System.out.println("The two land tracks are with equal size");
        }else {
            System.out.println("The two land tracks are not equal");
        }

    }
}
