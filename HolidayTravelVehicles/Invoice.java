
public class Invoice {
    private SalesPerson salesPerson;
    private Customer customer;
    private Vehicle vehicle;
    
    public Invoice(SalesPerson salesPerson, Customer customer, Vehicle vehicle) {
        this.salesPerson = salesPerson;
        this.customer = customer;
        this.vehicle = vehicle;
    }
    
    // Invoice specific methods
    public void printInvoiceDetails() {
        // Logic to print invoice details
    }
}
