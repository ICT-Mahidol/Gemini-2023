package HolidayTravelVechicles;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String FullName;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private String CustomerID;

    //?
    private List<Invoice> saleInvoices; // A Customer can have many SaleInvoices
    private List<TradeInVehicle> tradeInVehicles; // a customer can have many trade-in vehicles
    private List<Vehicle> vehicles; // a customer can own many vehicles
    private List<Salesperson> salesperson; // a customer can have many salespeople

    // Constructor
    public Customer(String fullname, String address, String phoneNumber, String email, String customerID) {
        this.FullName = fullname;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
        this.Email = email;
        this.CustomerID = customerID;

        //?
        this.saleInvoices = new ArrayList<>();
        this.tradeInVehicles = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.salesperson = new ArrayList<>();
    }

    //getter methods
    public String getFullName() {
        return FullName;
    }
    public String getAddress() {
        return Address;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getEmail() {
        return Email;
    }
    public String getCustomerID() {
        return CustomerID;
    }

    //setter methods
    public void setFullName(String Fullname) {
        this.FullName = Fullname;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setCustomerID(String customerID) {
        this.CustomerID = customerID;
    }

    public void purchaseVehicle(String serialNumber, Vehicle purchasedVehicle) {
        int i = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleSerialNumber().equals(serialNumber)) {
                // Assuming you want to add the purchased vehicle to the customer's list of vehicles
                this.vehicles.add(purchasedVehicle);
                // You can perform any additional processing here
                System.out.println("Vehicle with serial number " + serialNumber + " purchased successfully.");
                i = 0;
                break;
            }
            else{
                i++;
            }
        }
        if (i>0) {
            System.out.println("Vehicle with serial number " + serialNumber + " not found.");
        }
    }
    
    //2. for request invoice
    public void requestSignInvoice(Invoice saleInvoice) {
        if (saleInvoice != null) {
            System.out.println("Please sign the invoice:");
            // Assuming you have a method to capture the signature from the customer
            String signature = captureSignature(); // Implement this method accordingly

            // Assuming you have a method to set the signature in the SaleInvoice class
            saleInvoice.setSignature(signature); // Set the signature in the saleInvoice
            System.out.println("Thank you for signing the invoice.");
        } else {
            System.out.println("Invalid invoice provided.");
        }
    }

    // Method to capture signature (example implementation)
    String captureSignature() {
        // This method should capture the customer's signature, either through a digital input device or some other means
        // For demonstration purposes, let's assume the signature is captured as a string
        // In a real-world scenario, you would implement this method to interact with the appropriate hardware or software
        return "CustomerSignature123"; // Placeholder signature value for demonstration
    }

    //3. Sign invoice()
    public void SignInvoice(Invoice saleInvoice) {
        if (saleInvoice != null) {
            // Get the signature from the saleInvoice
            String signature = saleInvoice.getSignature();

            if (signature != null) {
                // Perform any additional processing if needed
                System.out.println("Invoice signed successfully by the customer: " + signature);
            } else {
                System.out.println("No signature found on the invoice.");
            }
        } else {
            System.out.println("Invalid invoice provided.");
        }
    }

    public String CustomerInfo() {
        // Dome
        // Creating a formatted string with customer information
        String customerInfo = String.format(""
                        + "Customer ID: %s\n"
                        + "Full Name: %s\n"
                        + "Address: %s\n"
                        + "Phone Number: %s\n"
                        + "Email: %s",
                this.CustomerID, this.FullName, this.Address, this.PhoneNumber, this.Email);
        return customerInfo;
    }

}
