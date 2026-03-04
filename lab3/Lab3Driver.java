package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab3Driver {
    public static void printProperties(String fileName, String propertyType) throws FileNotFoundException {
        /*
        printProperties reads property data from a file and prints properties of a specified type.

        @params fileName - the name of the file to read property data from
        @params propertyType - the type of property to filter and print. valid types;
            "Single Family Residential", "Multi-Family (2-4 Unit)", "Condo/Co-op",
            "Townhouse", "Vacant Land"
        @returns void
        */
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);
        scanner.nextLine(); // Skip header line        

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String type = parts[1];

            if (type.equals('"' + propertyType + '"')) {
                System.out.println(line);
            }
        }
        scanner.close();
    }

    public static void printPropertiesPrice(String fileName, int maxPrice) throws FileNotFoundException {
        /*
        printPropertiesPrice reads property data from a file and prints properties below a specified price.

        @params fileName - the name of the file to read property data from
        @params maxPrice - the maximum price to filter and print properties
        @returns void
        */
        File file = new File("lab3/" + fileName);

        Scanner scanner = new Scanner(file);
        scanner.nextLine(); // Skip header line

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            int price = Integer.parseInt(parts[4]);

            if (price <= maxPrice) {
                System.out.println(line);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        String propertyType;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the property data file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Would you like to search for properties by (1) Type or (2) Price or (3) Distance? Enter 1, 2, or 3: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine();

        if (searchChoice == 1) {
            System.out.print(
                "Please select a property type to filter\n" + 
                "1. 'Single Family Residential'\n" +
                "2. 'Multi-Family (2-4 Unit)'\n" +
                "3. 'Condo/Co-op'\n" +
                "4. 'Townhouse'\n" + 
                "5. 'Vacant Land'\n" +
                "Enter choice (1-5): "
            );
            String choice = scanner.nextLine();

            // Switch to convert numerical choice to property type string
            switch (choice) {
                case "1":
                    propertyType = "Single Family Residential";
                    break;
                case "2":
                    propertyType = "Multi-Family (2-4 Unit)";
                    break;
                case "3":
                    propertyType = "Condo/Co-op";
                    break;
                case "4":
                    propertyType = "Townhouse";
                    break;
                case "5":
                    propertyType = "Vacant Land";
                    break;
                default:
                    System.out.println("Invalid choice. Please restart the program and enter a number between 1 and 5.");
                    scanner.close();
                    return;
            }

            System.out.println("Properties of specified type: ");

            try {
                printProperties(fileName, propertyType);
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }

        } else if (searchChoice == 2) {
            System.out.print("Please enter the maximum price: ");
            int maxPrice = scanner.nextInt();

            System.out.println("Properties below specified price: ");

            try {
                printPropertiesPrice(fileName, maxPrice);
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }

        } else if (searchChoice == 3) {
            Scanner locationScanner = new Scanner(System.in);
            System.out.print("Please enter the X coordinate to search for: ");
            double coordinatex = locationScanner.nextDouble();
            System.out.print("Please enter the Y coordinate to search for: ");
            double coordinatey = locationScanner.nextDouble();
            locationScanner.nextLine(); // consume leftover newline after nextDouble()
            coordinatex = Math.toRadians(coordinatex);
            coordinatey = Math.toRadians(coordinatey);
            System.out.print("What is the file name: ");
            String fileName2 = locationScanner.nextLine();
            File file2 = new File(fileName2);
            double distance = 0.0;
            double distanceNew = 0.0;
            Scanner scanner2 = new Scanner(file2);
            if (scanner2.hasNextLine()) scanner2.nextLine(); // skip header row
            String bestLine = "";

            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String[] parts = line.split(",");
                if (parts.length < 17) continue; // skip malformed lines
                try {
                    double Latitude = Math.toRadians(Double.parseDouble(parts[15].replace("\"", "").trim()));
                    double Longitude = Math.toRadians(Double.parseDouble(parts[16].replace("\"", "").trim()));
                    double x = Math.cos(Latitude) * Math.cos(Longitude) - Math.cos(coordinatex) * Math.cos(coordinatey);
                    double y = Math.cos(Latitude) * Math.sin(Longitude) - Math.cos(coordinatex) * Math.sin(coordinatey);
                    distanceNew = Math.sqrt(x * x + y * y);
                    if (distanceNew < distance || distance == 0.0) {
                        distance = distanceNew;
                        bestLine = line;
                    }
                } catch (NumberFormatException e) {
                    continue; // skip any lines with unparseable coordinates
                
                }
            }
            System.out.println("Closest location found:");
            System.out.println(bestLine);
            scanner.close();
        } else {    
            System.out.println("Invalid choice. Please restart the program and enter 1 or 2.");
        }
        scanner.close();
    }
}
