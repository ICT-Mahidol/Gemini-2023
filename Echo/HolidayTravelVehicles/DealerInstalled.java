import java.util.ArrayList;

public class DealerInstalled{
    private String optionCode;
    private String description;
    private Double price;
    private Invoice invoice;

public DealerInstalled() {

}

public DealerInstalled(String option, String description, Double price) {
    this.optionCode = option;
    this.description = description;
    this.price = price;
}
}