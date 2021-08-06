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

        List <ItemInfo> itemInfo = getInfo();
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




    public List<ItemInfo> getInfo(){

        return ItemDataLoader.loadAllItemInfos();
    }



}


