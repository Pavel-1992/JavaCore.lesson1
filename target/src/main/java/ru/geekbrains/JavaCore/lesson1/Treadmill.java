package ru.geekbrains.JavaCore.lesson1;

public class Treadmill implements Obstacle {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean RUN(int MaximumLength) {
        return (MaximumLength >= length);
    }

    @Override
    public boolean JUMP(int MaximumHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Беговая дорожка длиной " + length + "м";
    }
}
