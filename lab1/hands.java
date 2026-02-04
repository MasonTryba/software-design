import java.util.Scanner;

public class hands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many inches is your horse?: ");
        int inches = scanner.nextInt();

        int hands = inches /  4;
        int remainingInches = inches % 4;
        float finalHands = hands + remainingInches * 0.1f;

        System.out.println("A horse " + inches + " inches high is " + finalHands + " hands high.");
        scanner.close();
    }
}
