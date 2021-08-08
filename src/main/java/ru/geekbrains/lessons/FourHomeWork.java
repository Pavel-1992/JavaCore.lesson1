package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Полностью разобраться с кодом, попробовать переписать с нуля,
 * стараясь не подглядывать в методичку.
 * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
 * например, с использованием циклов.
 */

public class FourHomeWork {
    public static char [] [] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
        humanTurn();
        printMap();
        if (checkWin (DOT_X)) {
            System.out.println("Победил человек");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
        }
        System.out.println("Игра завершена");
        }

        public static void initMap () {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i] [j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print (i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print ((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print (map [i] [j] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void  humanTurn () {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt () - 1;
            y = sc.nextInt () - 1;
        }
        while (!isCellValid(x,y));
        map [y] [x] = DOT_X;
    }

    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map [y] [x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn () {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map [y] [x] = DOT_O;
    }

    public static boolean checkWin (char symbol) {
        return (line(symbol) || column(symbol) || diagonal(symbol));
    }

    public static boolean line(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map [i] [j] == symbol) {
                    counter++;
                }
                if (counter == SIZE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean column(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map [j] [i] == symbol) {
                    counter++;
                }
                if (counter == SIZE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean diagonal(char symbol) {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                counter++;
            }
        }
        if (counter == SIZE) {
                    return true;
                }
        counter = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (map[i][j] == symbol) {
                counter++;
            }
        }
        if (counter == SIZE) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i] [j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
