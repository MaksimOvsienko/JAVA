//Задание 1:
//        Напишите программу на языке Java, которая
//        описывает две переменные целого типа и без
//        объявления других переменных меняет местами их значения.

package com.epam.homework2;

public class Homework2p1 {
    public static void main(String[] args) {
        int a=1, b = 5;
        System.out.printf("Initialized variables: a=" + a + " b=" + b);

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.printf("\nChanged variables: a=" + a + " b=" + b);
    }
}
