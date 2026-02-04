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
    }

    public static void printPropertiesPrice(String fileName, double maxPrice) throws FileNotFoundException {

    }
}
