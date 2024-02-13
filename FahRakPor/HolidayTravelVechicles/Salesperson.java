import java.util.ArrayList;
import java.util.List;

class Salesperson { 
    private String Fullname;
    private int EmployeeID;
    private String PhoneNumber;
    private String Email;
    private List<String> saleInvoices;

    Salesperson(){

    }

    Salesperson(String Fullname, int EmployeeID, String PhoneNumber, String Email, String Address){
        this.Fullname = Fullname;
        this.EmployeeID = EmployeeID;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;

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

    public void CreateInvoice(String Invoice) {

    }
}