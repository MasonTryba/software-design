package lab4;

public class RaceCarDriver extends person implements Comparable<Raceable> {
    private int starts;
    private int winnings;
    private int wins;

    public RaceCarDriver(String name, String country, int yearBorn, int starts, int winnings, int wins) {
        super(name, country, yearBorn);

        this.starts = starts;
        this.winnings = winnings;
        this.wins = wins;
    }

    public int compareTo(Raceable r) {
        return Double.compare(this.winnings, r.getWinnings());
    }

    public int getWinnings() {
        return winnings;
    }

    public double averageWinnings() {
        return numRaces == 0 ? 0 : winnings / numRaces;
    }
    public int compareTo(Raceable r) {
        return Double.compare(this.winnings, r.getWinnings());
    }
}
