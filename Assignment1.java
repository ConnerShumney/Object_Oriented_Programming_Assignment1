public class Assignment1 {
    public static void main(String[] args){
        //Create array objects to hold inventory.
        String[] itemNames = new String [10];
        double[] itemPrices = new double [10];
        int[] itemQuantities = new int [10];

        // Fill the arrays with inventory.
        String[] setNames= {"Banana", "Orange", "Milk", "Mango", "Grapes", "Pringles", "Coke", "Pepsi"};
        double[] setPrices= {.99, 1.50, 3.25, 1.25, 1.50, 3.00, 1.25, 1.00};
        int[] setQuantities= {15, 20, 5, 10, 20, 5, 40, 45};

        // Initialize the arrays with the set values.
        for (int i = 0 ; i < setNames.length; i++){
            itemNames[i] = setNames[i];
            itemPrices[i] = setPrices[i];
            itemQuantities[i] = setQuantities[i];
        }

        printInventory(itemNames, itemPrices, itemQuantities);
    }

    public static void printInventory(String[] itemNames, double[] itemPrices, int[] itemQuantities){
        for (int i = 0; i < itemNames.length; i++){
            if (itemNames[i] != null){
                System.out.println(itemNames[i] + " - Price: $" + itemPrices[i] + " - Quantity: " + itemQuantities[i]);
            } else{
                System.out.println("No items.");
            }
        }
    }
}
