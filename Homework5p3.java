//        Задание 3 – Создание третьего массива известной длины:
//        Напишите программу на языке Java, которая создает два массива
//        одинаковой размерности, а затем создает третий такой же размерности и
//        заполняет его попарной суммой элементов из первых двух.

package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5p3 {
    public static void main(String[] args) {
        int[] arr1 = getArr1(getSize());
        int[] arr2 = getArr2(arr1);
        int[] sumArr = getSum(arr1, arr2);
        print(arr1, arr2, sumArr);
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

    static int[] getArr1(Integer size) {
        int[] gayArray = new int[size];
        for (int a = 0; a < size; a++) {
            gayArray[a] = (int) (Math.random() * 50) - 25;
        }
        return gayArray;
    }

    static int[] getArr2(int[] arr1) {
        int size = arr1.length;
        int[] gayArray = new int[size];
        for (int a = 0; a < size; a++) {
            gayArray[a] = (int) (Math.random() * 50) - 25;
        }
        return gayArray;

    }

    static int[] getSum(int[] arr1, int[] arr2) {
        int oddSize = arr1.length;
        int[] oddArr = new int[oddSize];
        for (int i = 0, a = 0; a < oddSize ; i++, a++) {
            oddArr[a] = arr1[i] + arr2[i];
        }
        return oddArr;
    }

    static void print(int[] arr1, int[] arr2, int[] oddArr) {
        System.out.println("First generated array:\n" + Arrays.toString(arr1) +
                "\nSecond generated array:\n" + Arrays.toString(arr2) +
                "\nSummary array:\n" + Arrays.toString(oddArr));
    }
}
