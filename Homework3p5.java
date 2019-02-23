package com.epam.homework3;

import java.util.Scanner;

public class Homework3p5 {
    public static void main(String[] args) {
        System.out.println("Input width of figure");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int k = 1; k <= 2; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = n-i; j > 0; j--) {
                    System.out.printf(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                for (int j = 1; j <= i; j++) {
                    if (j>1) {
                        System.out.printf("*");
                    }
                }
                System.out.printf("\n");
            }
        }

    }
}
