package HolidayTravelVechicles;

import java.util.ArrayList;
import java.util.List;

public class TradeInVehicle extends Vehicle {
    private List<TradeInVehicle> tradeInAllow;

    public TradeInVehicle(String serial, String name, String model, int year, String manufacturer, float price) {
        super(serial, name, model, year, manufacturer, price);
        tradeInAllow = new ArrayList<>(); // Initialize the tradeInAllow list
    }

    public List<TradeInVehicle> getTradeInAllow() {
        return tradeInAllow;
    }

    public String getTradeInAllowInfo() {
        StringBuilder vehicleRecordsInfo = new StringBuilder();
        for (Vehicle vehicle : tradeInAllow) {
            vehicleRecordsInfo.append("Vehicle Serial Number: ").append(vehicle.getVehicleSerialNumber()).append("\n");
            vehicleRecordsInfo.append("Name: ").append(vehicle.getName()).append("\n");
            vehicleRecordsInfo.append("Model: ").append(vehicle.getModel()).append("\n");
            vehicleRecordsInfo.append("Year: ").append(vehicle.getYear()).append("\n");
            vehicleRecordsInfo.append("Manufacturer: ").append(vehicle.getManufacturer()).append("\n");
            vehicleRecordsInfo.append("Price: ").append(vehicle.getPrice()).append("\n\n");
        }
        return vehicleRecordsInfo.toString();
    }

    public void printTradeInVehicleInfo() {
        super.printVehicleInfo();
    }

    public boolean evaluateTradeInVehicle() {
        // Add logic to evaluate the trade-in vehicle
        return super.getYear() > 2013;
    }

    public void addAllowanceVehicle() {
        if (evaluateTradeInVehicle()) {
            tradeInAllow.add(this);
            if (!tradeInAllow.isEmpty()) {
                super.createVehicleRecord(getVehicleSerialNumber(), getName(), getModel(), getYear(), getManufacturer(), getPrice());
            }
        }
    }
}
