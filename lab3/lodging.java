package lab3;
public class lodging extends Property {
    public lodging(String mlsNumber, String address, String zip, String location,
                   int daysOnMarket, double price, int lotSize, String status,
                   double latitude, double longitude, int sqFeet, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {
        super(mlsNumber, address, zip, location, daysOnMarket, price, lotSize, status, latitude, longitude);
        this.sqFeet = sqFeet:
        this.yearBuilt = yearBuilt;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
        this.pricePerSqFoot = pricePerSqFoot;
        
    }

    
}
