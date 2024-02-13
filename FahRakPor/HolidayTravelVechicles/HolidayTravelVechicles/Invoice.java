package HolidayTravelVechicles;

import java.util.ArrayList;

public class Invoice {
    private Customer cus;
    private TradeInVehicle tradeV;
    private Vehicle purchaseV;
    private double taxesRate = 10.0;
    private double taxesAmount;
    private double licenseFeesAmount;
    private String evaluateTradeInVehicle;
    private String Signature;

    public Invoice(String fullName, String address, String phoneNumber, String email, String customerID) {
        this.cus = new Customer(fullName, address, phoneNumber, email, customerID);
    }

    public Invoice(String vehicleSerialNumber, String name, String model, int year, String manufacturer, String tradeInVehicle, float purchasedVehicle) {
        this.tradeV = new TradeInVehicle(vehicleSerialNumber, name, model, year, manufacturer, purchasedVehicle);
    }

    public Invoice(String vehicleSerialNumber, String name, String model, int year, String manufacturer) {
        this.purchaseV = new Vehicle(vehicleSerialNumber, name, model, year, manufacturer);
    }

    public Invoice(String invoiceID, Customer customer) {
        this.cus = customer;
    }

    public TradeInVehicle getTradeInVehicleInfo() {
        return tradeV;
    }

    public Vehicle getPurchasedVehicleInfo() {
        return purchaseV;
    }

    public ArrayList<Vehicle> getDealerInstalledOptions() {
        return purchaseV.getRecoed();
    }

    //setter methods
    public void setTaxesAmount(double taxesAmount) {
        this.taxesAmount = taxesAmount * (taxesRate / 100);
    }

    public void setLicenseFeesAmount(double licenseFeesAmount) {
        this.licenseFeesAmount = licenseFeesAmount;
    }

    public void setTradeInAllowance(String evaluateTradeInVehicle) {
        this.evaluateTradeInVehicle = evaluateTradeInVehicle;
    }

    public void setSignature(String sign) {
        this.Signature = sign;
    }

    //getter methods
    public double getTaxesAmount() {
        return this.taxesAmount;
    }

    public double getLicenseFeesAmount() {
        return this.licenseFeesAmount;
    }

    public String getTradeInAllowance() {
        return this.evaluateTradeInVehicle;
    }

    public String getSignature() {
        return this.Signature;
    }

    public void createTradeInAllowance(TradeInVehicle tradeInVehicle) {
        tradeInVehicle.AddAllowanceVehicle();
        ;
    }

    public String getCustomerInfo() {
        return this.cus.CustomerInfo();
    }
}
