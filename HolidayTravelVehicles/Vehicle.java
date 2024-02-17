public class Vehicle {
 private String serial_number;
 private String name;
 private String model;
 private int year;
 private String manufacturer;
 private int base_cost; 

    public Vehicle() {
    }

    public Vehicle(String serial_number, String name, String model, int year, String manufacturer, int base_cost) {
        this.serial_number = serial_number;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.base_cost = base_cost;
    }

    public String getSerial_number() {
        return this.serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBase_cost() {
        return this.base_cost;
    }

    public void setBase_cost(int base_cost) {
        this.base_cost = base_cost;
    }

    @Override
    public String toString() {
        return
            " serial_number='" + getSerial_number() + "'" +
            "name='" + getName() + "'" +
            "model='" + getModel() + "'" +
            "year='" + getYear() + "'" +
            "manufacturer='" + getManufacturer() + "'" +
            "base_cost='" + getBase_cost()+ "'" ;
    }
    
}
