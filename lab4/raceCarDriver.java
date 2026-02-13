package lab4;
public class raceCarDriver extends person {

    private int starts;
    private int winnings;
    private int wins;

    public raceCarDriver(String name, String country, int yearBorn, int starts, int winnings, int wins) {
        super(name, country, yearBorn);
        this.starts = starts;
        this.winnings = winnings;
        this.wins = wins;
    }
    
}
