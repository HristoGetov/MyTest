package Lesson10;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number...");
        int n = scanner.nextInt();

        for (int i = 1;i<n;i++){
            System.out.print(i + ", ");
            if (i==n-1){
                System.out.println(n);
            }
        }

        for (int j = 2; j < n; j+=2){
            System.out.print( j + ", ");
            if(j==n-2){
                System.out.println(n);
            }
        }

        for (int k=1; k < n;k++){
            System.out.print(k*k + ", ");
            if(k==n-1){
                System.out.println(k*k);
            }
        }

    }
}
