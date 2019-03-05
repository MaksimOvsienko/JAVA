//Задание 2:
//        Напишите программу на языке Java, которая вводит некоторую строку и
//        выводит в консоль все уникальные символы этой строки. Обработка строки
//        выполняется отдельным методом.

package com.epam.homework4;

import java.util.Scanner;
import java.util.*;

public class Homework4p2 {
    public static void main(String[] args) {
        System.out.println("Input string without spaces:");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String unic = unicS (str);
        System.out.println("Unique line: " + unic);
    }

    static String unicS (String str) {
        String conStr = "";
        List<Character> myList = new ArrayList<>();
        for(int i=0; i< str.length(); i++) {
            if (!myList.contains(str.charAt(i))) {
                myList.add(str.charAt(i));
            }
        }
        for(char c : myList) {
            conStr = conStr + c;
        }
        return conStr;
    }


}
