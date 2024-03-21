package HolidayTravelVechicles;

import java.util.ArrayList;

public class Vehicle {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float price;
    private ArrayList<Vehicle> record;

    public Vehicle() {
        record = new ArrayList<>();
        initializeVehicleList(); // Call method to initialize the list
    }

    public Vehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, float price) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getVehicleRecordsInfo() {
        StringBuilder vehicleRecordsInfo = new StringBuilder();
        for (Vehicle vehicle : record) {
            vehicleRecordsInfo.append("Vehicle Serial Number: ").append(vehicle.getVehicleSerialNumber()).append("\n");
            vehicleRecordsInfo.append("Name: ").append(vehicle.getName()).append("\n");
            vehicleRecordsInfo.append("Model: ").append(vehicle.getModel()).append("\n");
            vehicleRecordsInfo.append("Year: ").append(vehicle.getYear()).append("\n");
            vehicleRecordsInfo.append("Manufacturer: ").append(vehicle.getManufacturer()).append("\n");
            vehicleRecordsInfo.append("Price: ").append(vehicle.getPrice()).append("\n\n");
        }
        return vehicleRecordsInfo.toString();
    }
    

    public String getVehicleSerialNumber() {
        return vehicleSerialNumber;
    }

    public void setVehicleSerialNumber(String vehicleSerialNumber) {
        this.vehicleSerialNumber = vehicleSerialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Vehicle> getRecord() {
        return this.record;
    }

    public void setRecord(ArrayList<Vehicle> record) {
        this.record = record;
    }

    public void createVehicleRecord(String serial, String name, String model, int year, String manufacturer, float price) {
        if (record == null) {
            record = new ArrayList<>();
        }
        Vehicle vehicle = new Vehicle(serial, name, model, year, manufacturer, price);
        record.add(vehicle);
    }

    public void printVehicleInfo() {
        System.out.println("Vehicle Serial Number: " + vehicleSerialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
    
    private void initializeVehicleList() {
        createVehicleRecord("123ABC", "Car", "ModelX", 2022, "ManufacturerA", 1254333);
        createVehicleRecord("456DEF", "Truck", "ModelY", 2023, "ManufacturerB", 1755000);
    }
}
