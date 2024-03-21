package HolidayTravelVechicles;

import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private String fullName;
    private int employeeID;
    private String phoneNumber;
    private String email;
    private List<Invoice> saleInvoices;

    public Salesperson(String fullName, int employeeID, String phoneNumber, String email) {
        this.fullName = fullName;
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.saleInvoices = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Invoice> getSaleInvoices() {
        return saleInvoices;
    }

    public void setSaleInvoices(List<Invoice> saleInvoices) {
        this.saleInvoices = saleInvoices;
    }

    public void createInvoice(Invoice invoice) {
        saleInvoices.add(invoice);
    }
}
