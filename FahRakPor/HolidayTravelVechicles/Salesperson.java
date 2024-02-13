package HolidayTravelVechicles;
import java.util.ArrayList;
import java.util.List;


class Salesperson { 
    private String Fullname;
    private int EmployeeID;
    private String PhoneNumber;
    private String Email;
    private List<String> saleInvoices;
    private List<String> vehicleRecords;

    Salesperson(){

    }

    Salesperson(String Fullname, int EmployeeID, String PhoneNumber, String Email, String Address){
        this.Fullname = Fullname;
        this.EmployeeID = EmployeeID;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.saleInvoices = new ArrayList<>();
        this.vehicleRecords = new ArrayList<>();
    }

    public String getFullname() {
        return Fullname;
    }

    public int getEmloyeeID() {
        return EmployeeID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public List<String> getSaleInvoices() {
        return this.saleInvoices;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setEmloyeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void CreateInvoice(String saleInvoice) {
        saleInvoices.add(saleInvoice);
    }

    public void  CreateVehicleRecord(String VehicleRecord) {
        vehicleRecords.add(VehicleRecord);
    }

}