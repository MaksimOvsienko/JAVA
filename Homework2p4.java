//Задание 4:
//        Напишите программу на языке Java, которая вычисляет и выводит в консоль сумму прибыли
//        по заданному депозиту (например, 10000) на заданное количество месяцев (например, 6)
//        под указанный процент годовых (например, 12%).

package com.epam.homework2;

import java.util.Scanner;

public class Homework2p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input initial cash");
        Double sum = in.nextDouble();
        System.out.println("Input months");
        int m = in.nextInt();
        System.out.println("Input percents");
        int p = in.nextInt();
        sum = sum+sum*p*30*m/360/100; //считаем что в месяце 30 дней, поэтому в году 360 дней
        System.out.println("Final cash: " + sum);
    }
}
