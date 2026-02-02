package lab2;

public class Loan {
    public static boolean homeLoan(Person person) {
        return person.getIncome() >= 55000 && person.getCreditScore() >= 750;
    }

    public static boolean carLoan(Person person) {
        return person.getIncome() >= 50000 && person.getCreditScore() >= 740;
    }
}
