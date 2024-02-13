package HolidayTravelVehicles;

import java.util.Date; 
import java.util.List;
import java.util.Objects;
import java.util.Date;
import java.util.List;

public class Invoice {

    private String invoiceNum;
    private Date date;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle purchaseVehicle;
    private Vehicle tradeInVehicle;
    private double tradeInAllowance;
    private double totalPrice;
    private double taxes;
    private double licenseFees;
    private String signature;

    public Invoice(String invoiceNum, 
                    Date date, 
                    Customer customer, 
                    Salesperson salesperson,
                    Vehicle purchaseVehicle, 
                    Vehicle tradeInVehicle, 
                    double tradeInAllowance ,
                    double totalPrice ,
                    double taxes ,
                    double licenseFees ,
                    String signature) 
                   {
        this.invoiceNum = invoiceNum;
        this.date = date;
        this.customer = customer;
        this.salesperson = salesperson;
        this.purchaseVehicle = purchaseVehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.totalPrice = 0.0;
    }

    public String getSignature() {
        return signature;
    }
}
