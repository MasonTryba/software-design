


public class Townhouse extends Lodging {

    private double hoaFee;

    /**
     * Constructor that takes all attributes (Property + Lodging + Townhouse).
     */
    public Townhouse(String mlsNumber, String address, String zip, String location,
                     int daysOnMarket, double price, String status,
                     double latitude, double longitude,
                     int sqFeet, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot,
                     double hoaFee) {

        super(mlsNumber, address, zip, location, daysOnMarket, price,
                0, status, latitude, longitude,  // lotSize forced to 0
                sqFeet, yearBuilt, numBeds, numBaths, pricePerSqFoot);

        this.hoaFee = hoaFee;
    }

    public double getHoaFee() { return hoaFee; }
    public void setHoaFee(double hoaFee) { this.hoaFee = hoaFee; }
}
