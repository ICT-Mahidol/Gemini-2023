import java.util.ArrayList;

public class Dealer {
    private int dealerID;
    private int orderID;
    private String orderDetailed;

    public Dealer() {
    }

    public Dealer(int dealerID, int orderID, String orderDetailed) {
        this.dealerID = dealerID;
        this.orderID = orderID;
        this.orderDetailed = orderDetailed;
    }

    public int getDealerID() {
        return this.dealerID;
    }

    public int getorderID() {
        return this.orderID;
    }

    public String getOrderDetailed() {
        return this.orderDetailed;
    }

    public void setOrderDetailed(String orderDetailed) {
        this.orderDetailed = orderDetailed;
    }
    public String getDealer_Info(){
        return this.dealerID+" "+this.orderID+" "+this.orderDetailed;
    }
}