package lab5;

/**
* The Property class represents a general property that is for sale.
* It does not perform any computations except for setting and retrieving
* attributes.
*/

public class Property {
	// Attributes that generally describe a property.
	private String mlsNumber, address, zip, location, status;
	private double price, latitude, longitude;
	private int lotsize, daysOnMarket;
	
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
	 */
	public Property(String mlsNumber, String address, String zip, String location, String status, double price,
			double latitude, double longitude, int lotsize, int daysOnMarket) {
	
		this.mlsNumber = mlsNumber;
		this.address = address;
		this.zip = zip;
		this.location = location;
		this.status = status;
		this.price = price;
		this.latitude = latitude;
		this.longitude = longitude;
		this.lotsize = lotsize;
		this.daysOnMarket = daysOnMarket;
	}
	
	// Getters and setters
	/**
	 * @return the MLS number of the property
	 */
	public String getMlsNumber() {
		return mlsNumber;
	}
	/**
	 * @param mlsNumber  of the property
	 */
	public void setMlsNumber(String mlsNumber) {
		this.mlsNumber = mlsNumber;
	}
	/**
	 * @return the address of the property
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address of the property
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the zip code of the property
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip code of the property
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the street location of the property
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location street of the property
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return status of the property (For Sale, Contingent, Pending, Sold)
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status of the property (For Sale, Contingent, Pending, Sold)
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the advertised price of the property
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price  advertised price of the property
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return  latitude of the location of the property
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude of the location of the property
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return longitude of the location of the property
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude longitude of the location of the property
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return  lot size of the property
	 */
	public int getLotsize() {
		return lotsize;
	}
	/**
	 * @param lotsize of the property
	 */
	public void setLotsize(int lotsize) {
		this.lotsize = lotsize;
	}
	/**
	 * @return number of days that the property was on the market
	 */
	public int getDaysOnMarket() {
		return daysOnMarket;
	}
	/**
	 * @param daysOnMarket number of days the property has been on the market
	 */
	public void setDaysOnMarket(int daysOnMarket) {
		this.daysOnMarket = daysOnMarket;
	} 
	
	/**
	 * Overloaded toString to print out all property information
	 */
	public String toString() {
		return "MLS: " + mlsNumber + " Property address: " + address + ", " + zip + " ," + location + //
				"\nStatus: " + status + " Price: " + price + " Days on market: " + daysOnMarket;
	}

}