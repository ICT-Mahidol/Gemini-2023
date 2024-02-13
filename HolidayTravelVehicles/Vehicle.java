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

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("12345", "Toyota Camry", "XLE", 2023, "Toyota", 25000.00);

        System.out.println("Serial Number: " + myVehicle.getSerialNumber());
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());
        System.out.println("Base Cost: $" + myVehicle.getBaseCost());
    }

}
