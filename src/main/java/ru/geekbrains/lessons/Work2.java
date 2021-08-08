package ru.geekbrains.lessons;

public class Work2 {
    public static void main(String[] args) {
//        System.out.println(within10and20(5, 10));
//        positiveOrNegative();
//        System.out.println(trueOrFalse(-101));
//        stringAndNumber("Pavel", 10);
        System.out.println(yearTrueOrFalse(2024));
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */

    public static void positiveOrNegative() {
        int a = 25;
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    public static boolean trueOrFalse(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void stringAndNumber(String name, int a) {
        for (a = 0; a < 10; a++) {
            System.out.println(name);
        }
    }

    /**
     * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */

    public static boolean yearTrueOrFalse(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}

