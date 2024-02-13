public class Salesperson extends Person {
    private int salespersonID;
    private double salary;
    private String position;

    public Salesperson(String name, String address, String phoneNumber, int salespersonID, double salary,
            String position) {
        super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
        this.salary = salary;
        this.position = position;
    }

    public int getSalespersonID() {
        return salespersonID;
    }

    public double getSalary() {
        return salary;
    }

    public String position() {
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

    public String toString() {
        return this.getName() + " " + this.getAddress() + " " + this.getPhoneNumber() + " " + this.salespersonID + " "
                + this.salary + " " + this.position;
    }

}
