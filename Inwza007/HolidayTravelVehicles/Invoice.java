import java.util.Date;

public class Invoice {
    private String invoiceNo;
    private Date invoiceDate;
    private Customer customer;
    private Vehicle vehicle;
    private TradeInVehicle tradeinvehicle;
    private double price;
    private DealerInstallOption dealerinstalloption;

    public Invoice(String invoiceNo, Date invoiceDate, Customer customer, Vehicle vehicle, TradeInVehicle tradeinvehicle, double price, DealerInstallOption dealerinstalloption){
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tradeinvehicle = tradeinvehicle;
        this.price = price;
        this.dealerinstalloption = dealerinstalloption;
    }

    public Invoice(String invoiceNo, Date invoiceDate, Customer customer, Vehicle vehicle, TradeInVehicle tradeinvehicle, double price){
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tradeinvehicle = tradeinvehicle;
        this.price = price;
    }

    public String getinvoiceNo() {
        return invoiceNo;
    }
    public Date getinvoiceDate() {
        return invoiceDate;
    }
    public Customer getCustomerInfo() {
        return customer;
    }
    public Vehicle getVehicleInfo() {
        return vehicle;
    }
    public TradeInVehicle getTradeInVehicleInfo() {
        return tradeinvehicle;
    }
    public double getPrice() {
        return price;
    }
    public DealerInstallOption getDealerInstallOption() {
        return dealerinstalloption;
    }

    public void setinvoiceNo(String invoiceNo){
        this.invoiceNo = invoiceNo;
    }
    public void setinvoiceDate(Date invoiceDate){
        this.invoiceDate = invoiceDate;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void setTradeInVehicle(TradeInVehicle tradeinvehicle){
        this.tradeinvehicle = tradeinvehicle;
    }
    public void setPrice(double price){
        this.price = price;
    }
}