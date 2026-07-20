public class Assignment1 {
    public static void main(String[] args){
        String[] itemNames = new String [10];
        Double[] itemPrices = new Double [10];
        Integer[] itemQuantities = new Integer [10];

        // NOTE: I just added these items to confirm the program works. This will be removed once the inventory data is added.
        itemNames[0] = "Bannana";
        itemPrices[0] = 5.24;
        itemQuantities[0] = 6;

        printInventory(itemNames, itemPrices, itemQuantities);
    }

    public static void printInventory(String[] itemNames, Double[] itemPrices, Integer[] itemQuantities){
        for (int i = 0; i < itemNames.length; i++){
            if (itemNames[i] != null){
                System.out.println(itemNames[i] + " - Price: $" + itemPrices[i] + " - Quantity: " + itemQuantities[i]);
            } else{
                System.out.println("No items.");
            }
        }
    }
}
