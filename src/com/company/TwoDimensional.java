package com.company;

public class TwoDimensional {
    public static void main(String[] args) {
        int [] [] array = new int [5][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (75 - (-2)) + 2);
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }

        }
    }
