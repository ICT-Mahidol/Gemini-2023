package Inwza007.HolidayTravelVehicles;

public class DealerInstallOption {
    private String OptionCode; 
    private String Description;
    private String price;

    public DealerInstallOption(String OptionCode, String Description, String price) {
        this.OptionCode = OptionCode;
        this.Description = Description;
        this.price = price;
    }

    public String getOptionCode() {
        return OptionCode;
    }

    public void setOptionCode(String OptionCode) {
        this.OptionCode = OptionCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}