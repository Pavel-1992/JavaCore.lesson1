package ru.geekbrains.lessons;
public class FiveHomeWork {
    /**
     * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     * 4. Создать массив из 5 сотрудников.
     * Пример:
     * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
     * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
     * // потом для каждой ячейки массива задаем объект
     * persArray[1] = new Person(...);
     * ...
     * persArray[4] = new Person(...);
     * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Pavel Borzenkov", "QA Engineer", "pavel@tester.com",
                        "89228096225", 70000, 29),
                new Employee("Alex Mor", "developer", "alex@tester.com",
                        "89225696235", 80000, 35),
                new Employee("Alina Norina", "analyst", "lina@tester.com",
                        "89223245215", 90000, 34),
                new Employee("Vika Molina", "project manager", "vika@tester.com",
                        "89226766455", 100000, 36),
                new Employee("Oleg Sidorov", "system administrator", "oleg@tester.com",
                        "89228743238", 110000, 41)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}

