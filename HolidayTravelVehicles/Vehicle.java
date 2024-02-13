public class Vehicle {

    private int SerialNumber;
    private String Name;
    private String Model;
    private int Year;
    private String Manufacturer;
    private double BaseCost;

    public Vehicle() {
    }

    public Vehicle(int SerialNumber, String Name, String Model, int Year, String Manufacturer, int BaseCost) {
        this.SerialNumber = SerialNumber;
        this.Name = Name;
        this.Model = Model;
        this.Year = Year;
        this.Manufacturer = Manufacturer;
        this.BaseCost = BaseCost;
    }

    public void setSerialNumber(int serialNumber) {
        this.SerialNumber = serialNumber;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setManufacturer(String Manufacturner) {
        this.Manufacturer = Manufacturner;
    }

    public void setBaseCost(double BaseCost) {
        this.BaseCost = BaseCost;
    }

    public String getManufacturer() {
        return this.Manufacturer;
    }

    public int getYear() {
        return this.Year;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String toString() {
        String data = "----------\n";
        data += "Serial: " + this.getSerialNumber() + '\n';
        data += "Name: " + this.getName() + '\n';
        data += "Model: " + this.getModel() + '\n';
        data += "Year: " + this.getYear() + '\n';
        data += "Manufacturer: " + this.getManufacturer() + '\n';
        data += "Base Cost: " + this.getBaseCost() + '\n';
        data += "----------\n";

        // return this.serialNumber + "" + this.name + "" + this.model
        // + "" + this.year + "" + this.manufacturer + "" + this.baseCost;
        return data;
    }

    public String getVehicleInfo() {
        return "Name: " + this.Name + "\nModel: " + this.Model + "\nSerial Number: " + this.SerialNumber
                + "\nPrice: " + (this.BaseCost);
    }
}
