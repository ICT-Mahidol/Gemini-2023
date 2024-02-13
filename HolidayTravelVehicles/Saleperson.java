public class Saleperson extends Employee {
    private String SalepersonID;
    private ArrayList<Vehicle> vehicles;

    public Saleperson(String id){
        super();
        this.SalepersonID = newID;
    }

    public String getSalepersonID() {
        return SalepersonID;
    }

    public void setSalepersonID(String salepersonID) {
        SalepersonID = salepersonID;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
