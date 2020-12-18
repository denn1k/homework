package HW281120;

import java.util.Scanner;

import static java.lang.System.*;

public class Password {
    public static void main(String[] args) {
        out.println("Enter the password:");
        Scanner scanner = new Scanner(in);
        String s1;
        s1 = scanner.nextLine();
        String s2 = "pass123";
        String s3 = "admin";
        //var i =  s2;
        //var b =  s3;
        //var c = s1;
        if ( s1.equals(s2) ) {
            out.println("Authorized");
        } else if (s1.equals(s3)) {
            out.println("Authorized as Administrator");
        } else out.println("Wrong password! Try again.");
    }
}

