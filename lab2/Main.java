package lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Income: ");
        double income = input.nextDouble();
        input.nextLine(); // clear newline

        System.out.print("SSN: ");
        String ssn = input.nextLine();

        System.out.print("Credit Score: ");
        int creditScore = input.nextInt();
        input.nextLine(); // clear newline

        System.out.print("What loan would you like to apply for? (home/car): ");
        String loanType = input.nextLine();

        Person person = new Person(name, income, ssn, creditScore);

        if (loanType.equals("home")) {
            if (Loan.homeLoan(person)) {
                System.out.println("Congratulations! You have been approved for a home loan.");
            } else {
                System.out.println("Sorry, you do not qualify for a home loan.");
            }
        } else if (loanType.equals("car")) {
            if (Loan.carLoan(person)) {
                System.out.println("Congratulations! You have been approved for a car loan.");
            } else {
                System.out.println("Sorry, you do not qualify for a car loan.");
            }
        }

        input.close();
    }
}

