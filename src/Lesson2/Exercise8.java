package Lesson2;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of bought shares....");
        int numberOfBoughtShares=keyboard.nextInt();
        System.out.println("Please enter the price per share of purchased stock...");
        double priceOfBoughtShare=keyboard.nextDouble();
        System.out.println("Please enter the number of sold shares....");
        int numberOfSoldShares = keyboard.nextInt();
        System.out.println("Please enter the price per share of sold stock.");
        double priceOfSoldShare=keyboard.nextDouble();
        System.out.println("Please enter the percentage of the broker commission (in decimal)....");
        double brokerPercentage=keyboard.nextDouble();

        double brokerShareBought=((numberOfBoughtShares*priceOfBoughtShare)*brokerPercentage);
        double brokerShareSold = ((numberOfSoldShares*priceOfSoldShare)*brokerPercentage);
        double totalProfit = ((numberOfSoldShares*priceOfSoldShare)-brokerShareSold)-((numberOfBoughtShares*priceOfBoughtShare)+brokerShareBought);
        System.out.println("The amount of money Joe paid for stock: " + numberOfBoughtShares*priceOfBoughtShare);
        System.out.println("The amount of commission Joe paid his broker when he bought a stock: " + brokerShareBought);
        System.out.println("The amount of money that Joe sold the stock for: " + numberOfSoldShares*priceOfSoldShare);
        System.out.println("The amount of commission Joe paid his broker when he sold a stock: " + brokerShareSold);
        System.out.println("The profit Joe made after selling his stock and paying the two commissions: " + totalProfit);


    }
}
