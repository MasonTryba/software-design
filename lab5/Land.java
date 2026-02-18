package lab5;

/**
* The Land class represents a plot of land that is for sale.
* It does not perform any computations.
*/

public class Land extends Property {

	/**
	 * @param mlsNumber  MLS number of the property
	 * @param address of the property
	 * @param zip code of the property
	 * @param location  street location of the property
	 * @param status of the property (For Sale, Contingent, Pending, Sold)
	 * @param price listed price of the property (not the sale price)
	 * @param latitude of the property location
	 * @param longitude of the property location
	 * @param lotsize of the property
	 * @param daysOnMarket days the propery has been listed for sale
	 */	public Land(String mlsNumber, String address, String zip, String location, String status, double price,
			double latitude, double longitude, int lotsize, int daysOnMarket) {
		super(mlsNumber, address, zip, location, status, price, latitude, longitude, lotsize, daysOnMarket);
		// TODO Auto-generated constructor stub
	}
	 
	 public String toString() {
		 return "Land: " + super.toString();
	 }

}
