package ru.geekbrains.lessons;

public class Cat1 {
    private String name;
    private  int appetite;
    private boolean satiety;

    public Cat1( String name,  int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat( Plate e ) {
        if (!satiety) {
            satiety = e.declineFood(appetite);
        }
    }

    public void info() {
        System.out.printf("Кот %s с аппетитом %d %s\n", name, appetite, satiety ? "сытый" : "остался голодный");
    }
}
