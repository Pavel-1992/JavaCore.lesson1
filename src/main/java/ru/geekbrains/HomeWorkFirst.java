package ru.geekbrains;

public class HomeWorkFirst {
    public static void main(String[] args) {
        Participant[] participants = {
                new Man(3, 6, "Pasha"),
                new Man(5, 8, "Oleg"),
                new Cat(1, 3, "Murka"),
                new Cat(1, 6, "Vaska"),
                new Robot(1, 8, "Pol"),
                new Robot(5,9,"Bob")
        };

        Obstacle[] obstacles = {
                new Treadmill(5),
                new Treadmill(7),
                new Wall(2),
                new Wall(4)
        };

        for (Participant participant : participants) {
            System.out.println("К прохождению препятствий приступает " + participant);
            boolean winner = true;
            for (Obstacle obstacle : obstacles) {
                System.out.println(participant + " пробует выполнить " + obstacle);
                if (obstacle.JUMP(participant.getMaximumHeight()) ||
                        obstacle.RUN(participant.getMaximumLength())) {
                    System.out.println("И он справляется!!!");
                } else {
                    winner = false;
                    System.out.println("И он не справлется(((");
                    break;
                }
            }

            if(winner) {
                System.out.println(participant + " завершил дистанцию!!!");
            } else {
                System.out.println(participant + " проиграл(((");
            }
            System.out.println();
        }
    }
}