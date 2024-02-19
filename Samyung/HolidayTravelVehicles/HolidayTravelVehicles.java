public class HolidayTravelVehicles {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("NTA-001","Truck");
        System.out.println(v1.toString());
        Record r1 = new Record(001, "Tesla","Model-Y",1888,"SpaceX",100000);
        System.out.println(r1.toString());
    }
}