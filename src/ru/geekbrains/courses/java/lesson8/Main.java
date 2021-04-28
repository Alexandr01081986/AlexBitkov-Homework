package ru.geekbrains.courses.java.lesson8;

public class Main {
    public static void main(String[] args) {

        Barrier [] obstacles = {
                new RunningTrack(20),
                new Wall(4),
                new RunningTrack(50),
                new Wall(6),
                new RunningTrack(100),
                new Wall(10)
        };

        actions[] players = {
                new Cat(30, 5),
                new Human(100, 7),
                new Robot(200, 12)
        };

        players[0].run(obstacles[2].getValue());

        int i = 1;
        for (actions player: players) {
            System.out.println("Игрок № " + i);
            i++;
            for (Barrier obstacle: obstacles) {
                switch (obstacle.getType()){
                    case "Стена":
                        player.jump(obstacle.getValue());
                        break;
                    case "Беговая дорожка":
                        player.run(obstacle.getValue());
                        break;
                }
                if (!player.isDone()){
                    break;
                }
            }
        }

    }
}
