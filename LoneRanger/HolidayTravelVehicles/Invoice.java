package LoneRanger.HolidayTravelVehicles;

public class Invoice {
    private String customer;
    private String tradeInVehicle;
    private VehicleRecord purchaseVehicle;
    private double tradeInAllowance;
    private double finalNegotiatedPrice;
    private double taxes;
    private double licenseFees;
    private String dealerInstalledOption;

    public Invoice(String customer, String tradeInVehicle, VehicleRecord purchaseVehicle, double tradeInAllowance, double finalNegotiatedPrice, double taxes, double licenseFees, String dealerInstalledOption) {
        this.customer = customer;
        this.tradeInVehicle = tradeInVehicle;
        this.purchaseVehicle = purchaseVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.finalNegotiatedPrice = finalNegotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.dealerInstalledOption = dealerInstalledOption;
    }
}
