package HolidayTravelVechicles;

import java.util.List;

public class  TradeInVehicle extends Vehicle {
        private String VehicleSerialNumber;
        private String name;
        private String model;
        private int year;
        private String manufacturer;
        private float price;
        private List<TradeInVehicle> tredeInAllow;
       
        public TradeInVehicle(String serial, String nam, String mo, int y, String man, float p) {
            this.setVehicleSerialNumber(serial);
            this.setName(nam);
            this.setModel(mo);
            this.setYear(y);
            this.setManufacturer(man);
            this.setPrice(p);
        }
    
        public String getVehicleSerialNumber() {
            return VehicleSerialNumber;
        }
    
        public void setVehicleSerialNumber(String vehicleSerialNumber) {
            VehicleSerialNumber = vehicleSerialNumber;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getModel() {
            return model;
        }
    
        public void setModel(String model) {
            this.model = model;
        }
    
        public int getYear() {
            return year;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        public String getManufacturer() {
            return manufacturer;
        }
    
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    
        public float getPrice() {
            return price;
        }
    
        public void setPrice(float price) {
            this.price = price;
        }
        
        public boolean EvaluateTradeInVehicle() {
            // Add logic to evaluate the trade-in vehicle
            if(this.year<=2014){
                return false;
            }
            return true;
        }
    
        public void AddAllowanceVehicle() {
            if(EvaluateTradeInVehicle()==true){
                TradeInVehicle vehicle = new TradeInVehicle(VehicleSerialNumber, VehicleSerialNumber, VehicleSerialNumber, year, VehicleSerialNumber, price);
                vehicle.setVehicleSerialNumber(VehicleSerialNumber);
                vehicle.setName(name);
                vehicle.setModel(model);
                vehicle.setYear(year);
                vehicle.setManufacturer(manufacturer);
                vehicle.setPrice(price);
                tredeInAllow.add(vehicle);

                CreateVehicleRecord(VehicleSerialNumber, name, model, year, manufacturer, year);   
            }
        }
    }
    