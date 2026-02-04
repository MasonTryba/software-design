package lab3;

public class multifamily extends lodging {
    private int numFamilies;

    public multifamily(String mlsNumber, String address, String zip, String location,
                 int daysOnMarket, double price, int lotSize, String status,
                 double latitude, double longitude, int sqFeet, int yearBuilt,
                 int numBeds, int numBaths, double pricePerSqFoot,
                 int floorLevel, double hoaFees) {
        super(mlsNumber, address, zip, location, daysOnMarket, price, lotSize,
              status, latitude, longitude, sqFeet, yearBuilt, numBeds,
              numBaths, pricePerSqFoot);
        this.numFamilies = this.getnumBeds()/this.getNumBaths();
        
    }
    
}