package HolidayTravelVehicles;

public class Customer {
    
    private String customerID;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Customer() {}

    public Customer(String customerID, String name, String address, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getCustomerID() {
        return this.customerID;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCustomerID(String newCustomerID) {
        this.customerID = newCustomerID;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

}
