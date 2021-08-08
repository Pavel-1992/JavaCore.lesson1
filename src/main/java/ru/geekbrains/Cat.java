package ru.geekbrains;

public class Cat implements Participant {
    int MaximumHeight;
    int MaximumLength;
    String name;

    public Cat(int MaximumHeight, int MaximumLength, String name) {
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
        System.out.println("Cat jump");
    }

    @Override
    public int getMaximumLength() {
        return MaximumLength;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }
}