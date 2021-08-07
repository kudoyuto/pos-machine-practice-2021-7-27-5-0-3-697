package pos.machine;

public class Item {
    private String name;
    private  int quantity;
    private int price;
    private int subTotal;
    public Item(String name, int quantity, int unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.price = unitPrice;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getPrice() {
        return price;
    }

    public int getSubTotal() {
        return subTotal;
    }
}
