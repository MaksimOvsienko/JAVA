//Задание 3:
//        Напишите программу на языке Java, которая преобразует вес, заданный в фунтах,
//        в килограммы, но выводит раздельно количество полученных килограмм и грамм
//        (в 1 фунте 453,6 грамм).

package com.epam.homework2;
import java.util.Scanner;

public class Homework2p3 {
    public static void main(String[] args) {
        System.out.println("Input weight in pounds");
        Scanner in = new Scanner(System.in);
        double w = in.nextDouble();
        w = w * 0.453592;
        System.out.println("Weight in kilograms: " + w);
        double res2 = (w - (int)w)*1000; //gr
        int res3 = (int) res2;
        System.out.println("In other words: " + (int) w + " kg, " + res3 + " g");
    }
}
