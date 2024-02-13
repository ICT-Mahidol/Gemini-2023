import java.util.ArrayList;

public class Dealer extends Person {
    private int dealerID;
    private double salary;
    private String position;
    private ArrayList<Vehicle> vehicles;

    public Dealer() {
    }

    public Dealer(String name, String address, String phone, int DealerID, double salary, String position) {
        super();
        this.dealerID = dealerID;
        this.salary = salary;
        this.position = position;
    }

    public int getDealerID() {
        return dealerIID;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setDealerID(int DealerID) {
        this.dealerID = dealerID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}