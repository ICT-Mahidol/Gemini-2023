import java.util.ArrayList;

public class Vehicle {
    private int serialNum;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double basePrice;
    private ArrayList<Salesperson> salespersons;
    private Invoice invoice;

    public Vehicle() {
    }
    
    public Vehicle(int serialNum, String name, String model, int year, String manufacturer, double basePrice) {
        this.serialNum = serialNum;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
    }

    public void setSerialNo(int serialNum) {
        this.serialNum = serialNum;
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

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String toString() {
        return this.name + " " + this.model + " " + this.year + " " 
        + this.basePrice + " " + this.serialNum;
    }

    public void createNewVehicleRecord(Vehicle vehicle){
        vehicle = new Vehicle();
    }
}