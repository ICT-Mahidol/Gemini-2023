package HolidayTravelVechicles;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer cus;
    private TradeInVehicle tradeV;
    private Vehicle purchaseV;
    private double taxesRate = 10.0;
    private double taxesAmount;
    private double licenseFeesAmount;
    private String evaluateTradeInVehicle;
    private String Signature;
    
    public Invoice(Customer customer, TradeInVehicle tradeV) {
        this.cus = customer;
        this.tradeV = tradeV; // Initialize tradeV
    }    

    public Invoice(String vehicleSerialNumber, String name, String model, int year, String manufacturer, float p) {
        this.purchaseV = new Vehicle(vehicleSerialNumber, name, model, year, manufacturer, p);
    }

    public Invoice(String invoiceID, Customer customer, TradeInVehicle tradeInVehicle) {
        this.cus = customer;
    }

    public String getTradeInVehicleInfo() {
        return tradeV.getTradeInAllowInfo(); // Assuming this method exists in TradeInVehicle class
    }
    
    public String getTradeInAllow() {
        if(!tradeV.getTradeInAllow().isEmpty()){
            return tradeV.getTradeInAllowInfo();
        }
        else{
            return null;
        }
    }
    
    public Vehicle getPurchasedVehicleInfo() {
        return purchaseV;
    }   

    public ArrayList<Vehicle> getDealerInstalledOptions() {
        return purchaseV.getRecord();
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

    public List<TradeInVehicle> getTradeInAllowance() {
        return tradeV.getTradeInAllow();
    }

    public String getSignature() {
        return this.Signature;
    }

    public void createTradeInAllowance(TradeInVehicle tradeInVehicle) {
        tradeInVehicle.addAllowanceVehicle();
    }

    public String getCustomerInfo() {
        return this.cus.CustomerInfo();
    }
}
