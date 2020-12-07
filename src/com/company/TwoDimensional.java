package com.company;

public class TwoDimensional {
    public static void main(String[] args) {
        int [] [] Array = new int [5][7];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[i][j] = (int) (Math.random() * (75 - (-2)) + 2);
                System.out.format("%4d", Array[i][j]);
            }
        }
            System.out.println();
        }
    }
