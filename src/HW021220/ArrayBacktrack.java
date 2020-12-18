package HW021220;

import java.util.Scanner;

public class ArrayBacktrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] newArray = new int [5];
        System.out.println("Input 5 values:");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        for (int i = 4; i < newArray.length; i--) {
            System.out.print(" " + newArray[i]);
        }

    }
}
