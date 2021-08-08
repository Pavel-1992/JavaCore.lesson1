package ru.geekbrains.JavaCore.lesson1;

public class Man implements Participant {
    int MaximumHeight;
    int MaximumLength;
    String name;

    public Man(int MaximumHeight, int MaximumLength, String name) {
        this.MaximumHeight = MaximumHeight;
        this.MaximumLength = MaximumLength;
        this.name = name;
    }

    @Override
    public int getMaximumHeight() {
        return MaximumHeight;
    }

    @Override
    public void jump() {
        System.out.println("Man run");
    }

    @Override
    public int getMaximumLength() {
        return MaximumLength;
    }

    @Override
    public void run() {
        System.out.println("Man jump");
    }

    @Override
    public String toString() {
        return "Человек по имени " + name;
    }
}
