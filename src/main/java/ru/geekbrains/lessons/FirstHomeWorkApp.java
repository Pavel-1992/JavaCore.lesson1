package ru.geekbrains.lessons;

public class FirstHomeWorkApp {
        public static void main (String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
}

    public static void checkSumSign() {
            int a = 4;
            int b = 6;
            int c = a +b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c > 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
            int value = 50;
            if (value <= 0) {
                System.out.println("Красный");
            }
            if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            }
            if (value > 100) {
                System.out.println("Зелёный");
            }
    }
    public static void compareNumbers() {
        int a = 150;
        int b = 200;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
    }


