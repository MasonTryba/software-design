package lab2;

public class Person {
    private String name;
    private double income;
    private String ssn;
    private int creditScore;
 
    
    // empty constructor
    public Person() { }

    // full constructor
    public Person(String name, double income, String ssn, int creditScore) {
        this.name = name;
        this.income = income;
        this.ssn = ssn;
        this.creditScore = creditScore;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public String getSsn() {
        return ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}