package lab5;

import java.io.FileNotFoundException;
import java.util.*;

/**
* The Lab5Driver class tests the PropertyFinder class
*/

public class Lab5Driver {
	
	public static void main(String[] args) throws FileNotFoundException{
	    // Create scanner to obtain input from the user
	    Scanner input = new Scanner(System.in);
		
		// Prompt user for name of property file 
	    System.out.print("Enter name of real estate file: ");
	    String fileName = input.nextLine();
		input.close();
		
		// Create a PropertyFinder and initialize with entries in the filepp
	    PropertyFinder finder = new PropertyFinder(fileName);
		input.close();
	}
}
