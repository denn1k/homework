package com.company;
import java.util.Scanner;

public class quadratic {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value:");
        int a =  scanner.nextInt();
        System.out.println("Number =" + a);
        System.out.println("Input b value:");
        int b =  scanner.nextInt();
        System.out.println("Number =" + b);
        System.out.println("Input c value:");
        int c = scanner.nextInt();
        System.out.println("Number =" + c);
        int d = b*b-4*a*c;
        if (d > 0 && a != 0) {
            System.out.println("1st root equals :" + ((-b + Math.sqrt (d))/2*a ));
            {System.out.println("2nd root equals:" + ((-b - Math.sqrt (d))/2*a ));
        }
        } else if (d==0) {
            System.out.println("The only root equals:" + (-b / 2 * a));
        } else if (d<0) { System.out.println("No roots on the set of real numbers");}

    }
}
