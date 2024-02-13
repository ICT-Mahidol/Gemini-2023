package com.company;

public class Vehicle{

    private int SerialNumber;
    private String Name;
    private String Model;
    private int Year;
    private String Manufacturer;
    private double BaseCost;

    public Vehicle(){
    }

    public Vehicle(int SerialNumber, String Name, String Model, int Year, String Manufacturer, int BaseCost){
        this.SerialNumber = SerialNumber;
        this.Name = Name;
        this.Model = Model;
        this.Year = Year;
        this.Manufacturer = Manufacturer;
        this.BaseCost = BaseCost;
    }

    public void setSerialNumber(int serialNumber){
        this.SerialNumber = serialNumber;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setModel(String Model){
        this.Model = Model;
    }

    public void setYear(int Year){
        this.Year = Year;
    }

    public void setManufacturer(String Manufacturner){
        this.Manufacturer = Manufacturner;
    }

    public void setBaseCost(double BaseCost){
        this.BaseCost = BaseCost;
    }

    public String getManufacturer(){
        return this.Manufacturer;
    }

    public int getYear(){
        return this.Year;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public java.lang.String getName() {
        return Name;
    }

    public java.lang.String getModel() {
        return Model;
    }

    public double getBaseCost() {
        return BaseCost;
    }

    public String getVehicleInfo(){
        return
                "Name: " + this.Name + "/nModel: " + this.Model + "/nSerial Number: " + this.SerialNumber.toString()
                        + "/nPrice: " + this.BaseCost.toString();
    }
}
