package LoneRanger.HolidayTravelVehicles;

 public class Customers extends Invoice{
    private String CustomerID;
    private String name;


 public class Customers{
   private String CustomerID;
   private String address;
   private String name;
   private int telephone;

   public Customer(String name, String address, int telephone, String CustomerID) {
    super();
    this.customerID = customerID;
    this.name = name;
}

public String getCustomerID() {
    return customerID;
}


public void setCustomerID(String customerID) {
    this.customerID = customerID;
}

public String getName(){
    return name;
}
public void setName(String name) {
    this.name = name;
}
}
