package lab4;

public class RaceHorse extends Horse {
    private Horse dam;
    private Horse sire;
    private String registrationNumber;
    private int yearFirstRaced;
    private int numRaces;
    private double winnings;

    public RaceHorse(String name, double height, double weight, int yearBorn, String color,
                     String breed, Horse dam, Horse sire, String registrationNumber,
                     int yearFirstRaced, int numRaces, double winnings) {

        super(name, height, weight, yearBorn, color, breed);
        
        this.dam = dam;
        this.sire = sire;
        this.registrationNumber = registrationNumber;
        this.yearFirstRaced = yearFirstRaced;
        this.numRaces = numRaces;
        this.winnings = winnings;
    }
}
