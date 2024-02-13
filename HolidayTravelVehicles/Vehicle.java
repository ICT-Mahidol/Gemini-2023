package HolidayTravelVehicles;

public class Vehicle {

    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private Double baseCost;

    public Vehicle() {}

    Vehicle(String serialNumber, String name, String model, int year, String manufacturer, Double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Double getBaseCost() {
        return this.baseCost;
    }

    public void setSerialNumber(String newSerialNumber) {
        this.serialNumber = newSerialNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }

    public void setBaseCost(Double newBaseCost) {
        this.baseCost = newBaseCost;
    }

    public String toString() {
        return this.serialNumber + " " + this.name + " " + this.model + " " + this.year + " " + this.manufacturer;
    }

}
