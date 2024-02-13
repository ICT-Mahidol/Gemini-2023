package HolidayTravelVehicles;

public class Customer extends person{
    private int customerID;

    public Customer(String name, String address, String phoneNumber, int customerID) {
        super(String name, String address, String phoneNumber);
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        String str = "";
        str += ("ID: " + this.customerID + '\n');
        str += ("Name: " + this.name + '\n');
        str += ("Address: " + this.address + '\n');
        str += ("Phone Number: " + this.phoneNumber + '\n');

        return str;
    }

    public void makePurchase(){
        System.out.println(this);
    }
}