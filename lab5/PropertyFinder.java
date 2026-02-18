package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* The PropertyFinder class provides the functionality to search for a property
* in a variety of manners
*/

public class PropertyFinder {
	// You may assume a maximum of 200 properties in the file
	Property[] theProperties = new Property[200];
	// Keep track of the number of properties in the array
	int numProps = 0;
	
	public PropertyFinder(String fileName) throws FileNotFoundException{
		// Create Scanner to work on the file containing descriptions
		Scanner inFile = new Scanner(new File(fileName));
		// Read in the first line and discard as it contains just the header
		inFile.nextLine();
		// Loop through the file searching for the description within each line
		while (inFile.hasNextLine()){
			String line = inFile.nextLine();
		    // Split each line to get the second element which is the property type
			String[] entries = line.split(",");
			// If the entry matches the property type, print that line
			String prop = entries[1].toLowerCase();
 	     if (prop.contains("vacant land")){
	         theProperties[numProps++] = new Land(entries[0], entries[2],entries[3], entries[7],
	        	 entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
	        	 Double.parseDouble(entries[15]), Integer.parseInt(entries[9]), Integer.parseInt(entries[11]));
		     } else if (prop.contains("condo/co-op")){
		      theProperties[numProps++] = new Condo(entries[0], entries[2],entries[3], entries[7],
		    	entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
       			Double.parseDouble(entries[15]), 0, Integer.parseInt(entries[11]),
		        Integer.parseInt(entries[8]),  Integer.parseInt(entries[10]),  Integer.parseInt(entries[5]),
		        Integer.parseInt(entries[6]));
		     }
		     else if (prop.contains("single family")) {
			   theProperties[numProps++] = new SingleFamily(entries[0], entries[2],entries[3], entries[7],
			  	entries[13], Double.parseDouble(entries[4]), Double.parseDouble(entries[14]),
			  	Double.parseDouble(entries[15]), 
			  	Integer.parseInt(entries[9]), 
			  	Integer.parseInt(entries[11]),
			    Integer.parseInt(entries[8]), Integer.parseInt(entries[10]), Integer.parseInt(entries[5]),
			    Double.parseDouble(entries[6]));
		     }
		     else if (prop.contains("multi-family")) {
				   theProperties[numProps++] = new MultiFamily(entries[0], entries[2],entries[3], entries[7],
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
		// Close the file
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
