import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Create a new vehicle
        Vehicle vehicle = new Vehicle(12345, "Toyota", "Camry", 2022, "Toyota", 25000.0);

        // Display the vehicle information
        System.out.println(vehicle.toString());
    }
}