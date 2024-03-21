public class Customer {
    String name;
    String address;
    String phone;
    int customerID;
    int membershipLevel;

    public Customer() {
    }

    public Customer(String name, String address, String phone, int customerID, int membershipLevel) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.customerID = customerID;
        this.membershipLevel = membershipLevel;
    }

    public String getName(){
        return name;
    } 
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public int getCustomerID() {
        return customerID;
    }
    public int getMembershipLevel() {
        return membershipLevel;
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setMembershipLevel(int membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}