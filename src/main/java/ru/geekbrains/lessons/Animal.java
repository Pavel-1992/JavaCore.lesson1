package ru.geekbrains.lessons;

public abstract class Animal {
    private String name;
    private static int start = 0;

    public Animal (String name) {
        this.name = name;
        start++;
    }

    public abstract  void run (int distance);
    public abstract void swim (int distance);

    public static int getStart() {
        return start;
    }
}
