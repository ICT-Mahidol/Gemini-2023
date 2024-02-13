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

    public Invoice(int invoiceNumber, Date invoiceDate, double amount, double taxes,  double licensefees,  String signature) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.taxes = taxes;
        this.licensefees = licensefees;
        this.signature = signature;
    }

    public void RequestDealerInstallOption(String request) {
        this.request = request;
    }
}
