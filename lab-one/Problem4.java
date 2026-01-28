package lab1;

import java.util.Scanner;

/*
 * This class exercises functions and while loops
 */
public class Problem4 {

	public static boolean isTaxable(double price) {
		return price > 50.0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response = "yes";

		while (response.equalsIgnoreCase("yes")) {
			System.out.print("Enter item cost: ");
			String costInput = input.nextLine();
			double price = Double.parseDouble(costInput);

			if (isTaxable(price)) {
				System.out.println("Item with price " + price + " is taxable.");
			} else {
				System.out.println("Item with price " + price + " is not taxable.");
			}

			System.out.print("Continue? (yes/no): ");
			response = input.nextLine();
		}

		input.close();
	}
}
