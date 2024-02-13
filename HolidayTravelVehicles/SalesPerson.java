
public class SalesPerson extends Person {
    
    public SalesPerson(String name) {
        super(name);
    }
    
    // SalesPerson specific methods
    public void presentOptions() {
        // Logic to present options
    }
    
    public void discussDetails() {
        // Logic to discuss details
    }
    
    public void negotiate() {
        // Logic to negotiate
    }
    
    public Invoice createInvoice(Customer customer, Vehicle vehicle) {
        // Logic to create a new Invoice
        return new Invoice(this, customer, vehicle);
    }
}
