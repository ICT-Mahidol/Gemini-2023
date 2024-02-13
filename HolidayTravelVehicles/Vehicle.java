
public class Vehicle {
    private String model;
    private double price;
    
    // Constructor
    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }
    
    // Getters and Setters
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Main method for debugging
    public static void main(String[] args) {
        // Create instances of other classes to demonstrate connections
        Person person = new Person("John Doe");
        SalesPerson salesPerson = new SalesPerson("Jane Doe");
        Customer customer = new Customer("Customer Name");
        Vehicle vehicle = new Vehicle("CarModel", 30000.00);
        Invoice invoice = salesPerson.createInvoice(customer, vehicle);
        
        // Debugging outputs to ensure connection between classes
        System.out.println("Person Name: " + person.getName());
        System.out.println("SalesPerson Name: " + salesPerson.getName());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Vehicle Model: " + vehicle.getModel() + ", Price: " + vehicle.getPrice());
        
        // We assume that the Invoice class has a method to print details
        // This is a placeholder for demonstration purposes
        invoice.printInvoiceDetails();
    }
}
