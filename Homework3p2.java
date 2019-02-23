package com.epam.homework3;

import java.util.Scanner;

public class Homework3p2 {
    public static void main(String[] args) {
        System.out.println("Input width of figure");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j > 1) {
                    System.out.printf(" ");
                }
            }
            for (int k = n-i+1; k > 0; k--) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
