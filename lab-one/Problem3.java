package lab1;

/*
 * This class exercises functions and decision statements
 */

public class Problem3 {

	public static void main(String[] args){
		printSepticSize(3);
		purchaseMonth("May");
	}
 
	// Modify this function so that it uses a switch statement
	// old code commended out below, uses cases and then breaks to stop fall through
	public static void printSepticSize(int bedrooms){
		switch (bedrooms) {
			case 1:
			case 2:
				System.out.println("Minimum size of septic tank for a 1-2 bedroom house is 750 gallons.");
				break;
			case 3:
				System.out.println("Minimum size of septic tank for a 3 bedroom house is 1000 gallons.");
				break;
			case 4:
				System.out.println("Minimum size of septic tank for a 4 bedroom house is 1200 gallons.");
				break;
			case 5:
			case 6:
				System.out.println("Minimum size of septic tank for a 5-6 bedroom house is 1500 gallons.");
				break;
			default:
				System.out.println("Incorrect number of bedrooms!");

		}




		/*
		if (bedrooms == 1 || bedrooms == 2) {
			System.out.println("Minimum size of septic tank for a 1-2 bedroom house is 750 gallons.");
		}
		else if (bedrooms == 3) {
			System.out.println("Minimum size of septic tank for a 3 bedroom house is 1000 gallons.");
		}
		else if (bedrooms == 4) {
			System.out.println("Minimum size of septic tank for a 4 bedroom house is 1200 gallons.");
		}
		else if (bedrooms == 5 || bedrooms == 6) {
			System.out.println("Minimum size of septic tank for a 5-6 bedroom house is 1500 gallons.");
		}
		else System.out.println("Incorrect number of bedrooms!");
		*/
	}
	
	
	// Modify this function so that it uses an if-else block
	//Fixed it so the month would actually work properly, where it woudnt keep falling through each month until it hit a print
	public static void purchaseMonth(String month){
		if (month == "June") {
				System.out.println("Great month to purchase a house!");
		}
		else if (month =="October"){
				System.out.println("Good month to purchase a house!");
		}
		else if (month =="February"){
				System.out.println("OK month to purchase a house!");
		}
		else if (month =="December"){
				System.out.println("Worst month to purchase a house!");
		}
		else{
				System.out.println("Any month is a great month to purchase a house!");
		}
	}
}
