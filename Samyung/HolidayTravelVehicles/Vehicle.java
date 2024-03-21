public class Vehicle {
    private String RecreationVehicle;
    private String TravelTrailer;

    public Vehicle() {
    }

    public Vehicle( String RecreationVehicle, String TravelTrailer) {
        this.RecreationVehicle = RecreationVehicle;
        this.TravelTrailer = TravelTrailer;
    }
    public String getRecreationVehicle(){
        return this.RecreationVehicle;
    }
    public String getTravelTrailer(){
        return this.TravelTrailer;
    }


    public String toString() {
        return "Model NO: "+this.RecreationVehicle + "\nType: "  + this.TravelTrailer;
    }
   
}