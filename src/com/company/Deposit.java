package com.company;
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input m value :");
        int m = scanner.nextInt();
        System.out.println("Input k value :");
        int k = scanner.nextInt();
        System.out.println("Input n value :");
        int n = scanner.nextInt();
        int i;
        for (i = 0; i < k; i++) {
            m = m + n*m/100;

        } System.out.println(m);

    }
}
