package ru.geekbrains.lessons;

public class SixHomeWorkApp {
/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 * плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */

public static void main(String[] args) {
    Dog firstDog = new Dog("Sharik");
    Dog secondDog = new Dog("Baykal");
    Cat firstCat = new Cat("Soba");
    Cat secondCat = new Cat("Dymka");

    firstDog.run(500);
    firstDog.swim(10);
    secondDog.run(400);
    secondDog.swim(5);
    firstCat.run(200);
    firstCat.swim(0);
    secondCat.run(150);
    secondCat.swim(0);

    System.out.println("Dogs: " + Dog.getStart());
    System.out.println("Cats: " + Cat.getStart());
    System.out.println("Animals: " + Animal.getStart());

}
}
