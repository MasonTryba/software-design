package lab3;


public class Land extends Property {
    /*
    a Constructor that takes all Property attributes.
    */
    public Land(String mlsNumber, String address, String zip, String location,
                int daysOnMarket, double price, int lotSize, String status,
                double latitude, double longitude) {
        super(mlsNumber, address, zip, location, daysOnMarket, price, lotSize, status, latitude, longitude);
    }
}
