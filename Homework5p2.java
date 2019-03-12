//        Задание 2 - Обработка с разветвлением:
//        Напишите программу на языке Java, которая создает массив любого типа, а
//        затем вычисляет количество и сумму нечетных элементов массива.

package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5p2 {
    public static void main(String[] args) {
        int[] arr = getArr(getSize());
        print(arr);
    }

    static Integer getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
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

    static Integer getSumOfPairs(int[] arr) {
        int endPointer = arr.length - 1;
        int sum = 0;
        for (int i = 0; i <= endPointer; i +=2) {
            sum += arr[i];
        }
        return sum;
    }

    static void print(int[] arr) {
        System.out.println("Generated array:\n" + Arrays.toString(arr));
        System.out.println("Sum of paired elements:\n" + getSumOfPairs(arr));
    }
}
