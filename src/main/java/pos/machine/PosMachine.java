package pos.machine;

import java.util.*;
import java.util.stream.Collectors;


public class PosMachine {
    private ItemInfo info;
    public PosMachine() {
    }

    public String printReceipt(List<String> barcodes) {
        return null;
    }


    public List<Item> convertToItems(List<String> barcodes ) {

        List <ItemInfo> itemInfo = ItemDataLoader.loadAllItemInfos();
        List <Item> items =  new ArrayList<>();
        for(ItemInfo itemsDetail: itemInfo) {
            for(String barcode : barcodes.stream().distinct().collect(Collectors.toList())){
                if(itemsDetail.getBarcode().equals(barcode)) {
                    Item itemWithDetails = new Item(itemsDetail.getName(),Collections.frequency(barcodes,barcode),itemsDetail.getPrice());
                    items.add(itemWithDetails);
                }

            }
        }
        return items;
        }


   public List<Item> calculateItemsSubTotal(List<Item> items){
        for(Item item: items) {
            item.setSubTotal(item.getPrice() * item.getQuantity());
        }
        return items;
   }
   public Receipt calculateTotal(List<Item> items){
        int totalPrice = 0;

        for(Item item: items){
        totalPrice = item.getSubTotal() + totalPrice;
        }
        Receipt receipt = new Receipt (items,totalPrice);

        return receipt;
   }






}


