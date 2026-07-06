package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* The PropertyFinder class provides the functionality to search for a property
* in a variety of manners
*/

public class PropertyFinder {
	Property[] theProperties = new Property[200];
	int numProps = 0;
	
	public PropertyFinder(String fileName) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File(fileName));
		inFile.nextLine();
		
		while (inFile.hasNextLine()) {
			String line = inFile.nextLine();
			String[] entries = line.split(",");
			String prop = entries[1].toLowerCase();
			
			if (prop.contains("vacant land")) {
				theProperties[numProps++] = new Land(entries[0], entries[2], entries[3], entries[7],
			 	entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
			 	Double.parseDouble(entries[15]), Integer.parseInt(entries[9]), Integer.parseInt(entries[11]));
		    }
			
			else if (prop.contains("condo/co-op")) {
				theProperties[numProps++] = new Condo(entries[0], entries[2], entries[3], entries[7],
				entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
				Double.parseDouble(entries[15]), 0, Integer.parseInt(entries[11]),
				Integer.parseInt(entries[8]),  Integer.parseInt(entries[10]),  Integer.parseInt(entries[5]),
				Integer.parseInt(entries[6]));
		    }
			 
			else if (prop.contains("single family")) {
				theProperties[numProps++] = new SingleFamily(entries[0], entries[2], entries[3], entries[7],
				entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
				Double.parseDouble(entries[15]), 
				Integer.parseInt(entries[9]), 
				Integer.parseInt(entries[11]),
				Integer.parseInt(entries[8]), Integer.parseInt(entries[10]), Integer.parseInt(entries[5]),
				Double.parseDouble(entries[6]));
		    }
			
		    else if (prop.contains("multi-family")) {
				theProperties[numProps++] = new MultiFamily(entries[0], entries[2], entries[3], entries[7],
				entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
				Double.parseDouble(entries[15]), Integer.parseInt(entries[9]), Integer.parseInt(entries[11]),
				Integer.parseInt(entries[8]), Integer.parseInt(entries[10]), Integer.parseInt(entries[5]),
				Double.parseDouble(entries[6]));
			}
			
		    else if (prop.contains("townhouse")) {
				theProperties[numProps++] = new Townhouse(entries[0], entries[2],entries[3], entries[7],
				entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
				Double.parseDouble(entries[15]), 0, Integer.parseInt(entries[11]),
				Integer.parseInt(entries[8]), Integer.parseInt(entries[10]), Integer.parseInt(entries[5]),
				Double.parseDouble(entries[6]), Double.parseDouble(entries[13]));
		    }
				
		    else
		      	 System.out.println(entries[1] + " not recognized as property type!");
		}
		
		inFile.close();
	}
	
	/**
	 * Prints all of the properties in the array 
	 */
	public void printProperties() {
		for (int i=0; i<numProps; i++) {
			System.out.println(theProperties[i]);
		}
	}
	/**
	 * 
	 * @param maxPrice  maximum price for a property to be 
	 * included in the printing of the properties
	 */
	public void printProperties(double maxPrice) {
		for (int i=0; i<numProps; i++) {
			if (theProperties[i].getPrice() < maxPrice) {
			System.out.println(theProperties[i]);
			}
		}
	}
}
