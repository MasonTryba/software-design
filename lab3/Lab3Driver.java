package lab3;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Lab3Driver {
    public static void printProperties(String fileName, String propertyType) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String type = parts[1];

            if (type.equalsIgnoreCase(propertyType)) {
                System.out.println(line);
            }
        }

        scanner.close();
    }

    public static void printPropertiesPrice(String fileName, double maxPrice) throws FileNotFoundException {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the property data file name: ");
        String fileName = scanner.nextLine();

        System.out.println(
                "Please select a property type to filter\n" + 
                "1. 'Single Family Residential'\n" +
                "2. 'Multi-Family (2-4 Unit)'\n" +
                "3. 'Condo/Co-op'\n" +
                "4. 'Townhouse'\n" + 
                "5. 'Vacant Land'\n" +
                "Enter choice: "
            );
        String choice = scanner.nextLine();

        try {
            printProperties(fileName, choice);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        scanner.close();
    }
}
