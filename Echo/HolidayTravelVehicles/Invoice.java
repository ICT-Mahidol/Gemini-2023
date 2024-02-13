package Echo.HolidayTravelVehicles;
import java.util.Date;
import java.util.ArrayList;


public class Invoice {
    private Vehicle vehicle;
    private Vehicle tradeIn;
    private int invoiceNumber;
    private Date invoiceDate;
    private double amount;
    private double taxes;
    private double licensefees;
    private String signature;
    private Customer customer;
    private String request;
    private ArrayList<Salesperson> Salesperson;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Customer> vehicles;
     

public void RequestDealerInstallOption(String request){
    this.request = request;
}
}

