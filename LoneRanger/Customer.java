package LoneRanger.HolidayTravelVehicles;

public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone; // Changed from 'telephone' to 'phone' to match constructor
    private String email; // Added missing email field

    public Customer(String customerID, String name, String address, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email; // Initialize email
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() { // Getter for email
        return email;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) { // Setter for email
        this.email = email;
    }
}
