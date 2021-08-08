package ru.geekbrains.lessons;

public class NewSevenHomeWorkApp {
    public static void main(String[] args) {
        Plate1 plate = new Plate1(50);
        Cat2[] cats = new Cat2[]{
                new Cat2("Marli", 30),
                new Cat2("Murik", 15),
                new Cat2("Soba", 10),
        };
        feedCats(cats, plate);
        plate.put(10);
        feedCats(cats, plate);
    }
        public static void feedCats (Cat2[] cats, Plate1 plate){
            for (Cat2 cat : cats) {
                cat.eat(plate);
                cat.info();
            }
            System.out.println();
        }
    }
