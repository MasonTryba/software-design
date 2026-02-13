package lab3;

/**
 * Represents a single-family residential home.
 */
public class SingleFamily extends Lodging {
    /**
     * this will  takes all attributes (Property + Lodging) togther for SingleFamily.
     */
    public SingleFamily(String mlsNumber, String address, String zip, String location,
                        int daysOnMarket, double price, int lotSize, String status,
                        double latitude, double longitude,
                        int sqFeet, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {

        super(mlsNumber, address, zip, location, daysOnMarket, price, lotSize, status, latitude, longitude,
                sqFeet, yearBuilt, numBeds, numBaths, pricePerSqFoot);
    }
}
