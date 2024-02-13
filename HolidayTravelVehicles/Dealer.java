public class Dealer extends Employee {
    private String DealerID;

    public Dealer(String id){
        super();
        this.DealerID = id;
    }

    public String getDealerID() {
        return DealerID;
    }

    public void setDealerID(String dealerID) {
        DealerID = dealerID;
    }

}
