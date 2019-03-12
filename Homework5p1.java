package com.epam.homework5;

//        Задание 1 - Обработка без ветвлений:
//        Напишите программу на языке Java, которая создает массив любого типа, а
//        затем выводит его в консоль в прямом и обратном порядках.

import java.util.Arrays;
import java.util.Scanner;

public class Homework5p1 {
    public static void main(String[] args) {
        int[] arr = getArr(getSize());
        print(arr);
    }

    static Integer getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        Integer size = sc.nextInt();
        if (size < 1 || size == null) {
            System.out.println("Please input int number > 0");
            return null;
        }
        return size;
    }

    static int[] getArr(Integer size) {
        int[] gayArray = new int[size];
        for (int a = 0; a < size; a++) {
            gayArray[a] = (int) (Math.random() * 50) - 25;
        }
        return gayArray;
    }

    static int[] revArr(int[] arr) {
        int size = arr.length;
        int[] reverseArr = new int[size];
        for (int i = size - 1,  a = 0; a != size; i--, a++) {
            reverseArr[i] = arr[a];
        }
        return reverseArr;
    }

    static void print(int[] arr) {
        System.out.println("Generated array:\n" + Arrays.toString(arr));
        System.out.println("Reverse array:\n" + Arrays.toString(revArr(arr)));
    }
}
