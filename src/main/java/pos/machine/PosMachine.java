package pos.machine;

import java.util.List;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        return null;
    }

    public static List<ItemInfo> loadAllItemsInfo(List<String> barcodes) {
        List<ItemInfo> allItemDetails = ItemDataLoader.loadAllItemInfos();
        ;
        for(int i=0; i<allItemDetails.size(); i++){


                System.out.println("Name: " + allItemDetails.get(i).getName() +","+"Unit Price: "+allItemDetails.get(i).getPrice()+ "(yuan)" );




        }
        return allItemDetails;
    }
}


