

package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter income: ");
        int income = scanner.nextInt();

        System.out.print("Enter SSN: ");
        int ssn = scanner.nextInt();

        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        Person person = new Person(name, income, ssn, creditScore);

        System.out.println("");
}
