package HW021220;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("9*8 = ?");
        System.out.println("Input answer:");
        int n = scanner.nextInt();
        do {
            if (n != 72) {
                System.out.println("Wrong answer! Try again!");
                break;
            } else {
                System.out.println(n + " Well done!");
                break;
            }

        } while (n == 72) ;
    }
}

