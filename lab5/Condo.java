package lab5;

/**
* The Condo class represents a type of lodging that is for sale.
* It does not perform any computations except for setting and retrieving
* attributes.  Condos have a lot size of zero as they have no land
* associated with them.  
*/

public class Condo extends Lodging {
	
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
	 * @param daysOnMarket days the property has been listed for sale
	 * @param sqFeet - size of the living space in square feet
	 * @param yearBuilt - year that the lodging was built
	 * @param numBeds - number of bedrooms in the lodging (according to tax roll)
	 * @param numBaths - number of bathrooms in the lodging (according to tax roll)
	 */

	public Condo(String mlsNumber, String address, String zip, String location, String status, double price,
			double latitude, double longitude, int lotsize, int daysOnMarket, int sqFeet, int yearBuilt, int numBeds,
			int numBaths) {
		super(mlsNumber, address, zip, location, status, price, latitude, longitude, lotsize, daysOnMarket, sqFeet,
				yearBuilt, numBeds, numBaths);
		this.setLotsize(0);
	}
	
	public String toString() {
		 return "Condo: " + super.toString();
	 }
}
