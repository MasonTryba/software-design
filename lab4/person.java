package lab4;

public class Person {
    private String name;
    private String country;
    private int yearBorn;

    public Person(String name, String country, int yearBorn) {
        this.name = name;
        this.country = country;
        this.yearBorn = yearBorn;
    }

    public int getAge() {
        int whatYearIsIt = 2026;
        return whatYearIsIt - this.yearBorn;
    }
}
