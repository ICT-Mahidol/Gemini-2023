package HolidayTravelVehicles;
import java.util.Calendar;
// import java.util.Date;

public class Invoice {
    private int invoiceNo;
    private Calendar invoiceDate;
    private double amount;
    private Customer customer;
    private Vehicle vehicle;
    private Vehicle tradeIn;
    private InstallOption optionList;

    public Invoice() {
    }

    public Invoice(int invoiceNo, Calendar invoiceDate, double amount, Customer customer, Vehicle vehicle, Vehicle tradeIn, InstallOption optionList) {
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tradeIn = tradeIn;
        this.optionList = optionList;
    }
    
    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }   
    
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(Vehicle tradeIn) {
        this.tradeIn = tradeIn;
    }

    public InstallOption getOptionList() {
        return optionList;
    }

    public void setOptionList(InstallOption optionList) {
        this.optionList = optionList;
    }

    @Override
    public String toString() {
        return "Customer Name: " + customer.getFullName() + "\n" +
                "Invoice NO.: " + invoiceNo + "\n" +
                "Invoice Date: " + invoiceDate.getTime() + "\n" +
                "Amount: " + amount + "\n" +
                "Vehicle: " + vehicle.getName() + "\n" +
                "Trade In: " + tradeIn.getName() + "\n" +
                "Option List: " + optionList.toString() + "\n";
    }
}