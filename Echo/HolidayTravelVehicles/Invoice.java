package Echo.HolidayTravelVehicles;
import java.util.Date;


public class Invoice {
    private Vehicle vehicle;
    private Vehicle tradeIn;
    private int invoiceNumber;
    private Date invoiceDate;
    private double amount;
    private double taxes;
    private double licensefees;
    private String signature;
    // private Customer customer;
    private String request;


public void RequestDealerInstallOption(String request){
    this.request = request;
}
}

