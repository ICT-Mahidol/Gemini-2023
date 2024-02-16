package HolidayTravelVehicles;

public class Holiday {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSerialNumber(202413231);
        vehicle.setName("BMW");
        vehicle.setModel("Series 3");
        vehicle.setYear(2015);
        vehicle.setManufacturer("BMW");
        vehicle.setBaseCost(500000);
        System.out.println(vehicle.toString());
    }
}
