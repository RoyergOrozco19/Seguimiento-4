package Ej3;

public class client extends Person{
    private String purchaseHistory;

    public client(String name, String id, String address, String purchaseHistory){
        super(name, id, address);
        this.purchaseHistory = purchaseHistory;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
