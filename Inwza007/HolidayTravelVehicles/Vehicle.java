public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double basecost;
    
    public Vehicle(String serialNo, String name, String model, int year, String manufacturer, double basePrice) {
        this.serialNumber = serialNo;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.basecost = basePrice;
    }

    public int getSerialNumber(){
        return serialNumber;
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getBasecost(){
        return basecost;
    }

    public void setserialNumber(int n){
        this.serialNumber=n;
        return;
    }
    public void setName(String n){
        this.name=n;
        return;
    }
    public void setModel(String n){
        this.model=n;
        return;
    }
    public void setYear(int n){
        this.year=n;
        return;
    }
    public void setManufacturer(String n){
        this.manufacturer=n;
        return;
    }
    public void setBasecost(double n){
        this.basecost=n;
        return;
    }

    public String toString(){
        return this.serialNumber+" "+this.name+" "+this.model+" "+this.year+" "+this.manufacturer+" "+this.basecost;
    }

}