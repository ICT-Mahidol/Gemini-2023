public class VehicleRecord {
    private String vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacture;
    private double baseCost;

    // Constructor
    public VehicleRecord(String vehicleSerialNumber, String name, String model, int year, String manufacture, double baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacture = manufacture;
        this.baseCost = baseCost;
    }

    // Getters and Setters
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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    // Other methods such as toString() could be added here for better object representation
}

public class Main {
    public static void main(String[] args) {
        // Create a new VehicleRecord object using the constructor
        VehicleRecord myVehicle = new VehicleRecord("123ABC", "Sedan", "Accord", 2022, "Honda", 28000.00);
        
        // Output to console to verify the creation of the VehicleRecord object
        System.out.println("Vehicle Created: ");
        System.out.println("Serial Number: " + myVehicle.getVehicleSerialNumber());
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacture: " + myVehicle.getManufacture());
        System.out.println("Base Cost: " + myVehicle.getBaseCost());
    }
}

