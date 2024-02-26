import java.util.Date;

public class Invoice {
    private float price;
    private float tax;
    private float license_fees;
    private String full_customer_info;
    private boolean final_Nego_price;
    private String customerSignature;
    
    public Invoice(){

    }

    public Invoice(float price, float tax, float license_fees, String full_customer_info, boolean final_Nego_price, String customerSignature){
        this.price = price;
        this.tax = tax;
        this.license_fees = license_fees;
        this.full_customer_info = full_customer_info;
        this.final_Nego_price = final_Nego_price;
        this.customerSignature = customerSignature;
    }
    public String getInvoice_Info(){
        return this.price + " " + this.tax + " "+this.license_fees+
        " "+this.full_customer_info+" "+this.final_Nego_price+" "+this.customerSignature;
    }
}
