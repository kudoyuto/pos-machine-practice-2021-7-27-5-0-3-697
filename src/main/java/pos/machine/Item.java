package pos.machine;

public class Item {
    private String name;
    private  int age;
    private int price;
    private int subTotal;
    public Item(String name, int quantity, int unitPrice){
        this.name = name;
        this.age = quantity;
        this.price = unitPrice;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public int getSubTotal() {
        return subTotal;
    }
}
