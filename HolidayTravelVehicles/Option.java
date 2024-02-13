package HolidayTravelVehicles;

public class Option {
    private String optionID;
    private String name;
    private double cost;

    // Constructor
    public Option(String optionID, String name, double cost) {
        this.optionID = optionID;
        this.name = name;
        this.cost = cost;
    }

    // Getters and Setters
    public String getOptionID() {
        return optionID;
    }

    public void setOptionID(String optionID) {
        this.optionID = optionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // toString method
    @Override
    public String toString() {
        return "Option{" +
               "optionID='" + optionID + '\'' +
               ", name='" + name + '\'' +
               ", cost=" + cost +
               '}';
    }
}