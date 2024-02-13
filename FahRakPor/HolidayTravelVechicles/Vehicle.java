package HolidayTravelVechicles;

import java.util.ArrayList;

public class Vehicle {
    private String VehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float price;
    private ArrayList<Vehicle> record;

    public Vehicle() {
        record = new ArrayList<>();
    }

    public String getVehicleSerialNumber() {
        return VehicleSerialNumber;
    }

    public void setVehicleSerialNumber(String vehicleSerialNumber) {
        VehicleSerialNumber = vehicleSerialNumber;
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
        return record;
    }

    public void setRecord(ArrayList<Vehicle> record) {
        this.record = record;
    }

    public void CreateVehicleRecord(String serial, String nam, String mo, int y, String man, float p) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleSerialNumber(serial);
        vehicle.setName(nam);
        vehicle.setModel(mo);
        vehicle.setYear(y);
        vehicle.setManufacturer(man);
        vehicle.setPrice(p);
        record.add(vehicle);
    }

}
