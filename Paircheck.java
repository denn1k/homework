package com.company;

import java.util.Scanner;

public class Paircheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value:");
        int n =  scanner.nextInt();
        int b;
        b = n % 2;
        if (b==0) {
            System.out.println("Number is paired.");
        } else System.out.println("Number isn't paired.");


    }

}
