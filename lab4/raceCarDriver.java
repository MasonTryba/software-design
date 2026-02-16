package lab4;

public class RaceCarDriver extends Person implements Raceable,Comparable<Raceable> {
    private int starts;
    private int winnings;
    private int wins;

    public RaceCarDriver(String name, String country, int yearBorn, int starts, int winnings, int wins) {
        super(name, country, yearBorn);

        this.starts = starts;
        this.winnings = winnings;
        this.wins = wins;
    }

    public double averageWinnings() {
        return starts == 0 ? 0 : (double) winnings / starts;
    }

    public int getStarts() {return starts;}
    public void setStarts(int starts) {this.starts = starts;}

    public int getWins() {return wins;}
    public void setWins(int wins) {this.wins = wins;}

    public double getWinnings() {return winnings;}
    public void setWinnings(int winnings) {this.winnings = winnings;}

    public int compareTo(Raceable r) {
        return Double.compare(this.winnings, r.getWinnings());
    }

    public String toString() {
        return "Race Car Driver Name: " + getName() +
               ", Country: " + getCountry() +
               ", Year Born: " + getYearBorn() +
               "\nStarts: " + starts +
               ", Wins: " + wins +
               ", Winnings: " + winnings;
    }
}
