package lab4;

import java.util.Arrays;

public class Lab4Driver {
    public static void main(String[] args) {
        Horse sire1 = new Horse(
            "Rusty", 15.2, 1200, 2010, "Bay", "Thoroughbred"
        );

        Horse dam1 = new Horse(
            "Lady", 15.0, 1100, 2012, "Chestnut", "Thoroughbred"
        );

        Horse sire2 = new Horse(
            "Speedy", 16.0, 1300, 2008, "Black", "Appaloosa"
        );

        Horse dam2 = new Horse(
            "Grace", 15.5, 1150, 2011, "Grey", "Appaloosa"
        );

        RaceHorse raceHorse1 = new RaceHorse(
            "Thunder", 15.3, 1250, 2014, "Bay", "Thoroughbred",
            dam1, sire1, "REG123", 2015, 10, 50000.0
        );

        RaceHorse raceHorse2 = new RaceHorse(
            "Lightning", 16.1, 1280, 2012, "Black", "Appaloosa",
            dam2, sire2, "REG456", 2013, 8, 45000.0
        );

        RaceCarDriver raceCarDriver1 = new RaceCarDriver(
            "John Doe", "USA", 1985, 50, 2000000, 10
        );

        RaceCarDriver raceCarDriver2 = new RaceCarDriver(
            "Jane Doe", "UK", 1990, 40, 1500000, 8
        );

        Raceable[] racers = { raceHorse1, raceHorse2, raceCarDriver1, raceCarDriver2 };

        System.out.println("************ UNSORTED ARRAY ***************");

        for (Raceable r : racers) {
            System.out.println(r);
            System.out.println("================");
        }

        Arrays.sort(racers);

        System.out.println("************ SORTED ARRAY ***************");

        for (Raceable r : racers) {
            System.out.println(r);
            System.out.println("Average winnings: " + r.averageWinnings() + " per race run.");
            System.out.println("================");
        }
    }
}
