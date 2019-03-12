//        Задание 4 – Создание третьего массива неизвестной длины:
//        Напишите программу на языке Java, которая создает массив любого типа, а
//        затем разделяет его на два: из положительных и отрицательных элементов.

package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5p4 {
    public static void main(String[] args) {
        int[] arr = getArr(getSize());
        int[] negArr = getNegArr(arr);
        int[] posArr = getPosArr(arr);
        printArray(arr, negArr, posArr);
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

    static int getNegLength(int[] arr) {
        int len = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                len++;
            }
        }
        return len;
    }

    static int[] getNegArr(int[] arr) {
        int[] negArr = new int[getNegLength(arr)];
        for (int i = 0, a = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negArr[a] = arr[i];
                a++;
            }
        }
        return negArr;
    }

    static int[] getPosArr(int[] arr) {
        int leng = arr.length - getNegLength(arr);
        int[] positiveArr = new int[leng];
        for (int i = 0, a = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[a] = arr[i];
                a++;
            }
        }
        return positiveArr;
    }

    static void printArray(int[] arr, int[] negArr, int[] posArr) {
        System.out.println("Generated array:\n" + Arrays.toString(arr) +
                           "\nPositive array:\n" + Arrays.toString(posArr) +
                           "\nNegative array:\n" + Arrays.toString(negArr));
    }
}
