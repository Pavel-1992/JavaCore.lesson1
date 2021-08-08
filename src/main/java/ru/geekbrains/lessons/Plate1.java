package ru.geekbrains.lessons;

public class Plate1 {
    private int food;
    Plate1(int food) {
        this.food = food;
    }

    public boolean declineFood(int b) {
        boolean c = false;
        if (food - b >= 0) {
            food -= b;
            c = true;
        }
        return c;
    }
    public void put( int b) {
        this.food += b;
    }
}
