package Lesson2;

public class Exercise7 {
    public static void main(String[] args) {

       int numberOfShares=1000;
        double priceOfBoughtShare=32.87;
        double priceOfSoldShare=33.92;
        double brokerPercentage=0.02;
        double brokerShareBought=((numberOfShares*priceOfBoughtShare)*brokerPercentage);
        double brokerShareSold = ((numberOfShares*priceOfSoldShare)*brokerPercentage);
        double totalProfit = ((numberOfShares*priceOfSoldShare)-brokerShareSold)-((numberOfShares*priceOfBoughtShare)+brokerShareBought);
        System.out.println("The amount of money Joe paid for stock: " + numberOfShares*priceOfBoughtShare);
        System.out.println("The amount of commission Joe paid his broker when he bought a stock: " + brokerShareBought);
        System.out.println("The amount of money that Joe sold the stock for: " + numberOfShares*priceOfSoldShare);
        System.out.println("The amount of commission Joe paid his broker when he sold a stock: " + brokerShareSold);
        System.out.println("The profit Joe made after selling his stock and paying the two commissions: " + totalProfit);


    }
}
