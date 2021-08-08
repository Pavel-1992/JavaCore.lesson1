package ru.geekbrains;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean RUN(int MaximumLength) {
        return false;
    }

    @Override
    public boolean JUMP(int MaximumHeight) {
        return (MaximumHeight >= height);
    }

    @Override
    public String toString() {
        return "Стена высотой " + height + "м";
    }
}