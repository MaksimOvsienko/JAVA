//Задание 2:
//        Напишите программу на языке Java, которая:
//        − описывает трехзначное целое число number (например, 123);
//        − находит и выводит в консоль разность между числом number и числом,
//        составленным из цифр числа number, но взятых в обратном порядке
//        (для данного задания обратное число – это 321).

package com.epam.homework2;
import java.util.Scanner;

public class Homework2p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        String input = in.next();
        int reverse = Integer.parseInt(new StringBuffer(input).reverse().toString());
        System.out.println("\nString before reverse: " + input);
        System.out.println("String after reverse: " + reverse);
    }
}
