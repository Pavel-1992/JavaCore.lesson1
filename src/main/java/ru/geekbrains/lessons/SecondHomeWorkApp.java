package ru.geekbrains.lessons;

public class SecondHomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5, 20));
        positiveOrNegativeNumber();
        System.out.println(negativeNumberTrue(- 5));
        printWordNTimes("Friendship", 5);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    public static boolean sumOfNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */

    public static void positiveOrNegativeNumber() {
        int a = 100;
        if (a >= 0) {
            System.out.println("Положительное число");
        }
        if (a < 0) {
            System.out.println("Отрицательное число");
        }
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */

    public static boolean negativeNumberTrue(int a) {
        if (a < 0) {
            return true;
        }
            return false;
        }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void printWordNTimes(String word, int times) {
        for (int a = 0; a < times; a++)
            System.out.println(word);
    }
}



