public class HolidayTravelVehicles {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setName("Toyota");
        v.setModel("Vios");
        v.setYear(2015);
        v.setBasePrice(500000);
        System.out.println(v.toString());
    }
}