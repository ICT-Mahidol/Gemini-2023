import java.util.ArrayList;

public class Salesperson extends Person {
    private int salespersonID;
    private double salary;
    private String position;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Invoice> invoices;

    public Salesperson(String name, String address, String phone, int salespersonID, double salary, String position) {
        super();
        this.salespersonID = salespersonID;
        this.salary = salary;
        this.position = position;
        vehicles = new ArrayList<>();
        invoices = new ArrayList<>();
    }

    public int getSalespersonID() {
        return salespersonID;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setSalespersonID(int salespersonID) {
        this.salespersonID = salespersonID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Invoice> createInvoices(Customer customer, Vehicle vehicle, Vehicle tradeIn, double amount, Date invoiceDate) {
        Invoice invoice = new Invoice(customer, vehicle, tradeIn, amount, invoiceDate);
        invoices.add(invoice);
        return invoices;
    }

    public void negotiateVehicle(Vehicle vehicle, double price) {
        vehicle.setBasePrice(price);
    }
}

