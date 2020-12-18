package HW021220;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        int min;
        int max;
        System.out.println("Input 4 values:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }


        min = a[0];
        max = a[3];

        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];

        }
        if (max < a[0]) {
            max = a[0];
        }

        if (max < a[1]) {
            max = a[1];
        }

        if (max < a[2]) {
            max = a[2];
        }

        if (max < a[3]) {
            max = a[3];
        }

        System.out.println("Min=" +min);
        System.out.println("Max="+max);
        System.out.print(" " + a[0]);
        System.out.print(" " + a[1]);
        System.out.print(" " + a[2]);
        System.out.print(" " + a[3]);


    }
}