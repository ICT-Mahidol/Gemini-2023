package Inwza007.HolidayTravelVehicles;

public class TradeInVehicle extends Vehicle{

    private String make;//vehicle brand

    public TradeInVehicle(String serialNo, String name, String model, int year, String manufacturer, double basePrice, String make){
        super(serialNo, name, model, year, manufacturer, basePrice);
        this.make=make; 
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make=make;
    }

    public String toString(){
        return super.toString()+this.make;
    }
}
