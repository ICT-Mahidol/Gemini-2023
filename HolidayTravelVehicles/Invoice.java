public class Invoice {
    private Customer CustomerInfo;
    private Vehicle TradeinVehicle;

    private boolean TradeinAllowance;
    private int FinalNegotiatePrice;
    private String PurchaseVegicleInfo;
    private int Taxes;
    private int LicenseFees;
    private boolean InstallOption;

    public invoice(Customer customerinfo,Vehicle tradeinVehicle,boolean tradeinAllowance,int finalNegotiatePrice,
                   String purchaseVegicleInfo,int taxes,int licenseFees,boolean installOption){
        this.CustomerInfo = customerinfo;
        this.TradeinVehicle = tradeinVehicle;
        this.TradeinAllowance = tradeinAllowance;
        this.FinalNegotiatePrice = finalNegotiatePrice;
        this.PurchaseVegicleInfo = purchaseVegicleInfo;
        this.Taxes = taxes;
        this.LicenseFees = licenseFees;
        this.InstallOption = installOption;
    }
    public Customer getCustomerInfo() {
        return CustomerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        CustomerInfo = customerInfo;
    }

    public Vehicle getTradeinVehicle() {
        return TradeinVehicle;
    }

    public void setTradeinVehicle(Vehicle tradeinVehicle) {
        TradeinVehicle = tradeinVehicle;
    }

    public boolean isTradeinAllowance() {
        return TradeinAllowance;
    }

    public void setTradeinAllowance(boolean tradeinAllowance) {
        TradeinAllowance = tradeinAllowance;
    }

    public int getFinalNegotiatePrice() {
        return FinalNegotiatePrice;
    }

    public void setFinalNegotiatePrice(int finalNegotiatePrice) {
        FinalNegotiatePrice = finalNegotiatePrice;
    }

    public String getPurchaseVegicleInfo() {
        return PurchaseVegicleInfo;
    }

    public void setPurchaseVegicleInfo(String purchaseVegicleInfo) {
        PurchaseVegicleInfo = purchaseVegicleInfo;
    }

    public int getTaxes() {
        return Taxes;
    }

    public void setTaxes(int taxes) {
        Taxes = taxes;
    }

    public int getLicenseFees() {
        return LicenseFees;
    }

    public void setLicenseFees(int licenseFees) {
        LicenseFees = licenseFees;
    }

    public boolean isInstallOption() {
        return InstallOption;
    }

    public void setInstallOption(boolean installOption) {
        InstallOption = installOption;
    }
    public String getInvoiceInfo(){
        String str = String.valueOf(this.CustomerInfo) +
                this.TradeinVehicle +
                this.TradeinAllowance +
                this.FinalNegotiatePrice +
                this.PurchaseVegicleInfo +
                this.Taxes +
                this.LicenseFees +
                this.InstallOption;
        return str;
    }
}



