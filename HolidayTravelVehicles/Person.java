package HolidayTravelVehicles;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getPhoneNumber() {
        return phone;
    }
    
}
