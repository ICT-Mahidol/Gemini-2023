package LoneRanger.HolidayTravelVehicles;

public class VehicleRecord {
    private String vehicleSerialNumber; // Corrected field name to match constructor and getter method
    private String name;
    private String model;
    private int year;
    private String manufacturer; // Corrected typo to match getter and setter methods
    private double baseCost;

    public VehicleRecord(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer; // Corrected field assignment
        this.baseCost = baseCost;
    }

    public String getVehicleSerialNumber() {
        return vehicleSerialNumber;
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

    public void setVehicleSerialNumber(String vehicleSerialNumber) { // Corrected method name to match field
        this.vehicleSerialNumber = vehicleSerialNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void setYear(Integer newYear){
        this.year = newYear;
    }

    public void setManufacturer(String newManufacturer){
        this.manufacturer = newManufacturer;
    }

    public void setBaseCost(Integer newBaseCost){
        this.baseCost = newBaseCost;
    }
}
