package HolidayTravelVehicles;

public class Salesperson {
    private int id;
    private String name;
    private String address;
    private int phoneNumber;

    public Salesperson(int id, String name, String address, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getsalespersonId() {
        return this.id;
    }

    public String getsalespersonName() {
        return this.name;
    }

    public String getsalespersonAddress() {
        return this.address;
    }

    public int getsalespersonPhoneNumber() {
        return this.phoneNumber;
    }

    // create invoice
    public void createInvoice(Customer customer, int invoiceID, String tradeInVehicleInfo, int tradeInAllowance,
            String purchaseVehicleInfo, double finalNegotiatedPrice, double applicableTaxes, double licensingFees,
            boolean isCustomerSigned, boolean includesDealerOptions) {
        Invoice invoice = new Invoice(customer, this, invoiceID, tradeInVehicleInfo, tradeInAllowance,
                purchaseVehicleInfo, finalNegotiatedPrice, applicableTaxes, licensingFees, isCustomerSigned,
                includesDealerOptions);
        invoice.printInvoice();
    }
}
