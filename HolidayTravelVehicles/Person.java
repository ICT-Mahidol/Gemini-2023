package HolidayTravelVehicles;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNumber;
    }

    public static void main(String[] args) {
        Person A = new Person("Esan Man", "NakronPathom", "0123456789");

        System.out.println(A);
    }
}
