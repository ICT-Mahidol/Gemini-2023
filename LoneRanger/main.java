package LoneRanger.HolidayTravelVehicles;

public class Main {

    public static void main(String[] args) {
        // Assuming 'Vehicle' is a typo and should be 'VehicleRecord', and corrected the number format for base cost
        VehicleRecord myVehicle = new VehicleRecord("12345", "Mercedes AMG CLS53", "CLS53", 2023, "Mercedes", 165000.0); // Fixed typo in "Mercedes" and corrected the base cost format

        System.out.println("Serial Number: " + myVehicle.getVehicleSerialNumber());
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());
        System.out.println("Base Cost: $" + myVehicle.getBaseCost());
    }
}
