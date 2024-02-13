import java.util.Date;
import java.util.ArrayList;


public class Invoice {
    private int invoiceNumber;
    private Date invoiceDate;
    private double amount;
    private double taxes;
    private double licensefees;
    private String signature;
    private String request;
    private ArrayList<Salesperson> Salesperson;
    private ArrayList<Vehicle> vehicles;
    private Vehicle vehicle;
    private Vehicle tradeIn;
    private Customer customer;
    private ArrayList<DealerInstalled> dealeroptions;


public void RequestDealerInstallOption(String request){
    this.request = request;
}
}

