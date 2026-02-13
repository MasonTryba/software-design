package lab4;

public class RaceCarDriver extends Person {
    private int starts;
    private int winnings;
    private int wins;

    public RaceCarDriver(String name, String country, int yearBorn, int starts, int winnings, int wins) {
        super(name, country, yearBorn);

        this.starts = starts;
        this.winnings = winnings;
        this.wins = wins;
    }
}
