package HolidayTravelVechicles;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", "123-456-7890", "john@example.com", "CUST001");
    
        // Create a salesperson
        Salesperson salesperson = new Salesperson("Alice Smith", 1001, "987-654-3210", "alice@example.com");
    
        // Create a vehicle
        Vehicle vehicle = new Vehicle("123ABC", "Car", "ModelX", 2022, "ManufacturerA", 1254333);
        customer.purchaseVehicle("123ABC", vehicle); 
    
        // Create a trade-in vehicle
TradeInVehicle tradeInVehicle = new TradeInVehicle("456XYZ", "OldCar", "ModelY", 2015, "ManufacturerB", 5000.0f);

// Create an invoice for the customer with the trade-in vehicle
Invoice invoice = new Invoice(customer, tradeInVehicle);

    
        // Set taxes and license fees amount for the invoice
        invoice.setTaxesAmount(100.0);
        invoice.setLicenseFeesAmount(50.0);
    
        // Sign the invoice by the customer
        invoice.setSignature(customer.captureSignature());
    
        // Sign the invoice by the salesperson
        salesperson.createInvoice(invoice);
    
        // Display vehicle information
        System.out.println("\nVehicle information");
        vehicle.printVehicleInfo();

        System.out.println("\nTrade-In Information");
        if(tradeInVehicle.evaluateTradeInVehicle()){
            tradeInVehicle.printTradeInVehicleInfo();
        }
        else {
            System.out.println(" None");
        }
    
        // Display customer information
        System.out.println("\nCustomer Information");
        System.out.println(customer.CustomerInfo());
    
        // Display salesperson information
        System.out.println("\n\nSalesperson Information");
        System.out.println("Full Name: " + salesperson.getFullName());
        System.out.println("Employee ID: " + salesperson.getEmployeeID());
        System.out.println("Phone Number: " + salesperson.getPhoneNumber());
        System.out.println("Email: " + salesperson.getEmail());
    
        // Display invoice information
        System.out.println("\n\nInvoice Information");
        System.out.println(invoice.getCustomerInfo());
        System.out.println("Trade-In Vehicle: " + invoice.getTradeInAllowance());
        System.out.println("Taxes Amount: $" + invoice.getTaxesAmount());
        System.out.println("License Fees Amount: $" + invoice.getLicenseFeesAmount());
        System.out.println("Signature: " + invoice.getSignature());
    }
    
    
}
