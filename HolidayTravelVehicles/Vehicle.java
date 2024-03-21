package HolidayTravelVehicles;

public class Vehicle {
    private int serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle() {
    }

    public Vehicle(int serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String toString() {
        String data = "----------\n";
        data += "Serial: " + this.getSerialNumber() + '\n';
        data += "Name: " + this.getName() + '\n';
        data += "Model: " + this.getModel() + '\n';
        data += "Year: " + this.getYear() + '\n';
        data += "Manufacturer: " + this.getManufacturer() + '\n';
        data += "Base Cost: " + this.getBaseCost() + '\n';
        data += "----------\n";

        // return this.serialNumber + "" + this.name + "" + this.model
        // + "" + this.year + "" + this.manufacturer + "" + this.baseCost;
        return data;
    }
}
