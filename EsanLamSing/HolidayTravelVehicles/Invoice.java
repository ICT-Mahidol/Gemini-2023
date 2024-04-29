package HolidayTravelVehicles;

public class Invoice {
    public Customer customer;
    public Salesperson salePerson;
    private int invoiceID;
    private String tradeInVehicleInfo;
    private int tradeInAllowance;
    private String purchaseVehicleInfo;
    private double finalNegotiatedPrice;
    private double applicableTaxes;
    private double licensingFees;
    private boolean isCustomerSigned;
    private boolean includesDealerOptions;

    public Invoice(Customer customer, Salesperson salePerson, int invoiceID, String tradeInVehicleInfo,
            int tradeInAllowance, String purchaseVehicleInfo, double finalNegotiatedPrice, double applicableTaxes,
            double licensingFees, boolean isCustomerSigned, boolean includesDealerOptions) {
        this.customer = customer;
        this.salePerson = salePerson;
        this.invoiceID = invoiceID;
        this.tradeInVehicleInfo = tradeInVehicleInfo;
        this.tradeInAllowance = tradeInAllowance;
        this.purchaseVehicleInfo = purchaseVehicleInfo;
        this.finalNegotiatedPrice = finalNegotiatedPrice;
        this.applicableTaxes = applicableTaxes;
        this.licensingFees = licensingFees;
        this.isCustomerSigned = isCustomerSigned;
        this.includesDealerOptions = includesDealerOptions;
    }

    public void printInvoice() {
        System.out.println("=============================");
        System.out.println("Invoice Info");
        System.out.println("Invoice ID: " + this.invoiceID);
        System.out.println("Customer: " + this.customer.getName());
        System.out.println("Sale Person: " + this.salePerson.getsalespersonName());
        System.out.println("Trade In Vehicle Info: " + this.tradeInVehicleInfo);
        System.out.println("Trade In Allowance: " + this.tradeInAllowance);
        System.out.println("Purchase Vehicle Info: " + this.purchaseVehicleInfo);
        System.out.println("Final Negotiated Price: " + this.finalNegotiatedPrice);
        System.out.println("Applicable Taxes: " + this.applicableTaxes);
        System.out.println("Licensing Fees: " + this.licensingFees);
        System.out.println("Is Customer Signed: " + this.isCustomerSigned);
        System.out.println("Includes Dealer Options: " + this.includesDealerOptions);
        System.out.println("=============================");
    }
}
