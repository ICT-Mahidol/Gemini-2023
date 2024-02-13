package HolidayTravelVechicles;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", "123-456-7890", "john@example.com", "CUST001");

        // Create a salesperson
        Salesperson salesperson = new Salesperson("Alice Smith", 1001, "987-654-3210", "alice@example.com");

        // Create a vehicle
        Vehicle vehicle = new Vehicle("123ABC", "Car", "ModelX", 2022, "ManufacturerA");
        // Add the vehicle to the customer's list
        customer.purchaseVehicle("123ABC");

        // Create an invoice for the customer
        Invoice invoice = new Invoice("Invoice001", customer);

        // Set taxes and license fees amount for the invoice
        invoice.setTaxesAmount(100.0);
        invoice.setLicenseFeesAmount(50.0);

        // Create a trade-in vehicle
        TradeInVehicle tradeInVehicle = new TradeInVehicle("456XYZ", "OldCar", "ModelY", 2010, "ManufacturerB", 5000.0f);

        // Add trade-in allowance to the invoice if applicable
        if (tradeInVehicle.EvaluateTradeInVehicle()) {
            invoice.createTradeInAllowance(tradeInVehicle);
        }

        // Sign the invoice by the customer
        customer.SignInvoice(invoice);

        // Sign the invoice by the salesperson
        salesperson.createInvoice(invoice);

        // Display customer information
        System.out.println("Customer Information:");
        System.out.println(customer.CustomerInfo());

        // Display salesperson information
        System.out.println("\nSalesperson Information:");
        System.out.println("Full Name: " + salesperson.getFullName());
        System.out.println("Employee ID: " + salesperson.getEmployeeID());
        System.out.println("Phone Number: " + salesperson.getPhoneNumber());
        System.out.println("Email: " + salesperson.getEmail());

        // Display invoice information
        System.out.println("\nInvoice Information:");
        System.out.println("Customer: " + invoice.getCustomerInfo());
        System.out.println("Trade-In Vehicle: " + invoice.getTradeInVehicleInfo());
        System.out.println("Trade-In Allowance: " + invoice.getTradeInAllowance());
        System.out.println("Taxes Amount: $" + invoice.getTaxesAmount());
        System.out.println("License Fees Amount: $" + invoice.getLicenseFeesAmount());
        System.out.println("Signature: " + invoice.getSignature());
    }
}
