public class Customer {
    private String customerID;
    private String customerName;
    private String phoneNumber;

    public Customer(String customerID, String customerName, String phoneNumber){
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void purchaseVehicle(Vehicle vehicle) {
        return purchaseVehicle();
    }

    public String getInfo(){
        return "Customer ID: " + customerID + ", Name: " + customerName + ", Phone Number: " + phoneNumber;
    }
}
