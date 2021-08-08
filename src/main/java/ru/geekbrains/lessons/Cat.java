package ru.geekbrains.lessons;

public class Cat extends Animal {
    private static int start = 0;
    private int runDistance = 200;

    public Cat(String name) {
        super(name);
        start++;
    }

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.printf("Кот пробежал %d метров\n",distance);
        }
    }

    public void swim (int distance) {
        System.out.printf("Кот не умеет плавать\n");
    }
    public static int getStart() {
        return start;
    }

}
