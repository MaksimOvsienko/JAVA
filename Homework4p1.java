//Задание 1:
//        Напишите программу на языке Java, которая вводит целое число,
//        преобразует его в двоичное представление, сохраняя как строку, и выводит в
//        консоль результат. Преобразование выполняется отдельным методом.

package com.epam.homework4;

import java.util.Scanner;

public class Homework4p1 {
    public static void main(String[] args) {
        System.out.println("Input int:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num <=0) {
            System.out.println("input number >= 0");
            return;
        }

        String str1 = binaryStr(num);
        System.out.println("Binary equivalent of " + num + " = " + str1);
    }

    static String binaryStr (int num) {
        //String str = Integer.toString(num, 2); - вариант здорового человека, а ниже - курильщика
        int b;
        String temp = "";
        while(num !=0){
            b = num%2;
            temp = b + temp;
            num = num/2;
        }
        return temp;
    }
}
