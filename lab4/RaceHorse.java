package lab4;

public class RaceHorse extends Horse implements Raceable, Comparable<Raceable> {
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

    public Horse getDam() {return dam;}
    public void setDam(Horse dam) {this.dam = dam;}

    public Horse getSire() {return sire;}
    public void setSire(Horse sire) {this.sire = sire;}

    public String getRegistrationNumber() {return registrationNumber;}
    public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber;}

    public int getYearFirstRaced() {return yearFirstRaced;}
    public void setYearFirstRaced(int yearFirstRaced) {this.yearFirstRaced = yearFirstRaced;}

    public int getNumRaces() {return numRaces;}
    public void setNumRaces(int numRaces) {this.numRaces = numRaces;}

    public double getWinnings() {return winnings;}
    public void setWinnings(double winnings) {this.winnings = winnings;}

    public int compareTo(Raceable r) {
        return Double.compare(this.winnings, r.getWinnings());
    }

    public double averageWinnings() {
        return numRaces == 0 ? 0 : winnings / numRaces;
    }

    public String toString() {
        return super.toString() + "\n Sire: " + sire.getName() +
               "\n Dam: " + dam.getName() +
               "\nRegistration Number: " + registrationNumber +
               " Year First Raced: " + yearFirstRaced +
               ", Num Races: " + numRaces +
               ", Winnings: " + winnings;
    }
}
