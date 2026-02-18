package lab5;

/**
* The Lodging class represents a type of Property that is for sale.
* Lodgings include all subtypes where people are allowed to live 
* and sleep
*/

public class Lodging extends Property {
	// Attributes for square feet, year built and other attributes of lodging
	private int sqFeet, yearBuilt, numBeds;
	private double numBaths;
	
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
	public Lodging(String mlsNumber, String address, String zip, String location, String status, double price, 
			double latitude, double longitude, int lotsize, int daysOnMarket,
			int sqFeet, int yearBuilt, int numBeds, double numBaths) {
		super(mlsNumber, address, zip, location, status, price, latitude, longitude, lotsize, daysOnMarket);
		this.sqFeet = sqFeet;
		this.yearBuilt = yearBuilt;
		this.numBeds = numBeds;
		this.numBaths = numBaths;
	}

	/**
	 * @return square feet in the lodging
	 */
	public int getSqFeet() {
		return sqFeet;
	}

	/**
	 * @param sqFeet in the lodging
	 */
	public void setSqFeet(int sqFeet) {
		this.sqFeet = sqFeet;
	}

	/**
	 * @return year the lodging was built
	 */
	public int getYearBuilt() {
		return yearBuilt;
	}

	/**
	 * @param yearBuilt year the lodging was built
	 */
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	/**
	 * @return number of bedrooms according to the tax rolls
	 */
	public int getNumBeds() {
		return numBeds;
	}

	/**
	 * @param numBeds number of bedrooms according to the tax rolls
	 */
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	/**
	 * @return number of bathrooms according to the tax rolls
	 */
	public double getNumBaths() {
		return numBaths;
	}

	/**
	 * @param numBaths number of bathrooms according to the tax rolls
	 */
	public void setNumBaths(double numBaths) {
		this.numBaths = numBaths;
	}

	/**
	 * @return price per square foot
	 */
	public double getPricePerSqFoot() {
		return this.getPrice()/this.sqFeet;
	}
	
	public String toString() {
		return super.toString() + "\nSquare feet: " + this.sqFeet + " Year Built: " + this.yearBuilt + //
				" Bedrooms: " + this.numBeds + " Baths: " + this.numBaths + "\nPrice per Sq Foot: " + //
				this.getPricePerSqFoot();
	}

}