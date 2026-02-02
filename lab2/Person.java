package lab2;

public class Person {
    public String name;
    public int income;
    public int ssn;
    public int creditScore;

    public Person() {}

    public Person(String name, int income, int ssn, int creditScore) {
        this.name = name;
        this.income = income;
        this.ssn = ssn;
        this.creditScore = creditScore;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public int getSsn() {
        return ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

}
