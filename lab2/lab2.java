package lab2;
import java.util.Scanner;

public class lab2 {
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

        Person person1 = new Person(name, income, ssn, creditScore);

        System.out.println(
            person1.getName() + " " +
            person1.getIncome() + " " +
            person1.getSsn() + " " +
            person1.getCreditScore()
        );
        Loan loan1 = new Loan();
    }
}
