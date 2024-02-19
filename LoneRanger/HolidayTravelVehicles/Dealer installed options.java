package LoneRanger.HolidayTravelVehicles;

public class DealerInstalledOption { // Renamed class to match the file name
    private String optionCode;
    private String description;
    private double price;

    public DealerInstalledOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public String getOptionCode() { // Corrected method name to follow camelCase
        return optionCode;
    }

    public void setOptionCode(String optionCode) { // Corrected method name to follow camelCase
        this.optionCode = optionCode;
    }

    public String getDescription() { // Corrected method name to follow camelCase
        return description;
    }

    public void setDescription(String description) { // Corrected method name to follow camelCase
        this.description = description;
    }

    public double getPrice() { // Corrected method name to follow camelCase
        return price;
    }

    public void setPrice(double price) { // Corrected method name to follow camelCase
        this.price = price;
    }

    @Override
    public String toString() {
        return "Option{" +
                "optionCode='" + optionCode + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
