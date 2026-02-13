package lab4;
public class person {
    private String name;
    private String country;
    private int yearBorn;
    public person(String name, String country, int yearBoarn) {
        this.name = name;
        this.country = country;
        this.yearBorn = yearBoarn;
    }
    public int getAge() {
        int whatYearIsIt = 2026;
        return whatYearIsIt - this.yearBorn;
    }

}
