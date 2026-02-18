package lab4;

public class Horse {
    private String name;
    private double height;
    private double weight;
    private int yearBorn;
    private String color;
    private String breed;

    public Horse(String name, double height, double weight, int yearBorn, String color, String breed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.yearBorn = yearBorn;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public int getYearBorn() {return yearBorn;}
    public void setYearBorn(int yearBorn) {this.yearBorn = yearBorn;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

     public String toString() {
        return "Horse Name: " + name +
               ", Height: " + height +
               ", Weight: " + weight +
               ", Year Born: " + yearBorn +
               ", Color: " + color +
               ", Breed: " + breed;
     }
}
