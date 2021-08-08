package ru.geekbrains.lessons;

public class Dog extends Animal {
    private static int start = 0;
    private int runDistance = 500;
    private int swimDistance = 10;

    public Dog (String name) {
        super(name);
       start++;
    }

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.printf("Собака пробежала %d  метров\n", distance);
        }
        else {
            System.out.printf("Собака не может пробежать %d  метров\n", distance);
        }
    }

    public void swim (int distance) {
        if (distance <= swimDistance) {
            System.out.printf("Собака проплыла %d  метров\n", distance);
        } else {
            System.out.printf("Собака не может проплыть %d  метров\n", distance);
        }
    }
    public static int getStart() {
        return start;
    }

}
