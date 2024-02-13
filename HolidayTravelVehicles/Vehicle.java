package HolidayTravelVehicles;

public class Vehicle {
    private int serialNo;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double basePrice;

    public Vehicle() {
    }
    
    public Vehicle(int serialNo, String name, String model, int year, String manufacturer, double basePrice) {
        this.serialNo = serialNo;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle Name: " + name + 
        "\nSerial Number: " + serialNo + 
        "\nModel: " + model + 
        "\nYear: " + year + 
        "\nManufacturer: " + manufacturer + 
        "\nBase Price: " + basePrice;
    }
}
