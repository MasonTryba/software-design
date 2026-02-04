import java.util.Scanner;

public class appliances {
    static float salesTaxRate = 0.06f;
    static int deliveryCharge = 150;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter refridgerator price: ");
        float priceRefridgerator = scanner.nextFloat();

        System.out.print("Enter stove price: ");
        float priceStove = scanner.nextFloat();

        System.out.print("Enter time before delivery (in days): ");
        int days = scanner.nextInt();

        float subTotal = priceRefridgerator + priceStove;
        float salesTax = subTotal * salesTaxRate;
        float total = subTotal + salesTax + deliveryCharge;

        System.out.println("Hello " + name);
        System.out.println("Your refridgerator ($" + priceRefridgerator + ") and stove ($" + priceStove + ") will be delivered " + days + " days from now.");
        System.out.println("Your total cost will be: $" + total);

        scanner.close();
    }
}
