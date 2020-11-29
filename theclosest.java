package com.company;

import java.util.Scanner;

public class theclosest {
 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            {
                System.out.println("Input n value:");
            }

            int n = scanner.nextInt();

            {
                System.out.println("Input m value:");
            }

            int m = scanner.nextInt();
            int a;
            int b;
            a = Math.abs(n-10);
            b = Math.abs(m-10);
        if(a > b)



                {
                    System.out.println(m);
                }
            else

                {
                    System.out.println(n);
                }


            }
        }

