import java.util.ArrayList;

public class Customer extends Person {
    private int customerID;
    private ArrayList<Vehicle> ownVehicles;

    public Customer(String name, int customerID, String address, String phoneNumber, ArrayList<Vehicle> v) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
        this.ownVehicles = v;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void addVehicle(Vehicle v) {
        ownVehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        ownVehicles.remove(v);
    }

    public ArrayList<Vehicle> getOwnVehicle() {
        return this.ownVehicles;
    }

    public void setCustomerID(int cusID) {
        this.customerID = cusID;
    }

    public String toString() {
        return this.getName() + " " + this.customerID + " " + this.getAddress() + " " + this.getPhoneNumber();
    }

}
