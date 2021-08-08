package ru.geekbrains.lessons;

public class Cat2 {
    private String name;
    private  int appetite;
    private boolean wellfed;

    public Cat2( String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellfed = false;
    }

    public void eat(Plate1 plate1) {
        if (!wellfed) {
            wellfed = plate1.declineFood(appetite);
        }
    }

    public void info() {
        System.out.printf("Кот %s с аппетитом %d %s\n", name, appetite, wellfed ? "сытый" : "голодный");
    }
    }
