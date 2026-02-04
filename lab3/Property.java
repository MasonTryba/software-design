package lab3;

public class Property {

    // ===== Attributes (all private) =====
    private String mlsNumber;
    private String address;
    private String zip;
    private String location;
    private int daysOnMarket;
    private double price;
    private int lotSize;
    private String status;
    private double latitude;
    private double longitude;




    public Property(String mlsNumber, String address, String zip, String location,
                    int daysOnMarket, double price, int lotSize, String status,
                    double latitude, double longitude) {
        this.mlsNumber = mlsNumber;
        this.address = address;
        this.zip = zip;
        this.location = location;
        this.daysOnMarket = daysOnMarket;
        this.price = price;
        this.lotSize = lotSize;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // the Getters and Setters thats needed
    public String getMlsNumber() { return mlsNumber; }
    public void setMlsNumber(String mlsNumber) { this.mlsNumber = mlsNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getDaysOnMarket() { return daysOnMarket; }
    public void setDaysOnMarket(int daysOnMarket) { this.daysOnMarket = daysOnMarket; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getLotSize() { return lotSize; }
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
}
