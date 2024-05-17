package HolidayTravelVehicles;

public class Main {

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
