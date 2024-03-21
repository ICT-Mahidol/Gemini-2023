import java.util.Date;

public class Invoice {
    private int invoiceNo;
    private Date invoiceDate;
    private double amount;
    private Customer customer;
    private Vehicle vehicle;
    private Vehicle tradeIn;

    public int getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getTradeIn() {
        return this.tradeIn;
    }

    public void setTradeIn(Vehicle tradeIn) {
        this.tradeIn = tradeIn;
    }
    
}