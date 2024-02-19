package LoneRanger.HolidayTravelVehicles;

public class Transaction {
    private String customerSign; // Corrected variable name for clarity

    public Transaction() {
        // Removed the incorrect private declaration from the no-argument constructor
    }

    public Transaction(String customerSign) {
        this.customerSign = customerSign;
    }

    public String getTransaction() { // Corrected method name for clarity
        return customerSign;
    }

    public void setTransaction(String customerSign) {
        this.customerSign = customerSign;
    }
}
