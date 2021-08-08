package ru.geekbrains;

public class Robot implements Participant {
    int MaximumHeight;
    int MaximumLength;
    String name;

    public Robot(int MaximumHeight, int MaximumLength, String name) {
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
        System.out.println("Robot jump");
    }

    @Override
    public int getMaximumLength() {
        return MaximumLength;
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public String toString() {
        return "Робот с именем " + name;
    }
}