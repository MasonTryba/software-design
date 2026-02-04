package lab3;
public class lodging extends Property {
    private int sqFeet;
    private int yearBuilt;
    private int numBeds;
    private int numBaths;
    private double pricePerSqFoot;
    private lodging(String mlsNumber, String address, String zip, String location,
                   int daysOnMarket, double price, int lotSize, String status,
                   double latitude, double longitude, int sqFeet, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {
        super(mlsNumber, address, zip, location, daysOnMarket, price, lotSize, status, latitude, longitude);
        this.sqFeet = sqFeet;
        this.yearBuilt = yearBuilt;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
        this.pricePerSqFoot = pricePerSqFoot;

    }
    public int getsqFeet() {
        return sqFeet;
    }
    public int getyearBuilt() {
        return yearBuilt;
    }
    public int getnumBeds() {
        return numBeds;
    }
    public int getNumBaths() {
        return numBaths;
    }
    public double getPricePerSqFoot() {
        return pricePerSqFoot;
    }
    public void setsqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }
    public void setyearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    public void setnumBeds(int numBeds) {
        this.numBeds = numBeds;
    }
    public void setnumBaths(int numBaths) {
        this.numBaths = numBaths;
    }
    public void setPricePerSqFoot(double pricePerSqFoot) {
        this.pricePerSqFoot = pricePerSqFoot;
    }


    
}
