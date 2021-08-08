package ru.geekbrains.lessons;

import java.util.Arrays;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

public class Work3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invertArray(new int[]{1, 0, 1, 0, 0, 1})));
    }

    public static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}