import java.util.ArrayList;

public class Customer extends Person {
    private int customerID;
    private int membershipLevel;
    private ArrayList<Invoice> invoices;

    public Customer() {
    }

    public Customer(String name, String address, String phone, int customerID, int membershipLevel) {
        super();
        this.customerID = customerID;
        this.membershipLevel = membershipLevel;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public boolean negotiateVehicle(int salepersonID) {
        if (membershipLevel >= 2) { 
            return true; 
        } else {
            return false; 
        }
    }
    public boolean requestTradein() {
        if (membershipLevel >= 1) { 
            return true;
        } else {
            return false; 
        }
    }

}