import java.util.Scanner;

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

        // use a Scanner and a while loop to vreate a menu
    Scanner sc = new Scanner(System.in);

    // Menu loop (exits at users choice)
    while (true) {

    // Display menu options
        System.out.println("\n--- Grocery Menu ---");
        System.out.println("1. View Inventory");
        System.out.println("2. Restock Item");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        // Read the user's menu choice
        int choice = sc.nextInt();
        sc.nextLine(); // Clear leftover newline so nextLine() works correctly

        // 1 for view
        if (choice == 1) {
            printInventory(itemNames, itemPrices, itemQuantities);
        }

        // 2 for restock
        else if (choice == 2) {
            System.out.print("Enter item name to restock: ");
            String target = sc.nextLine(); // Read item name

            System.out.print("Enter amount to add: ");
            int amount = sc.nextInt(); // Read restock amount

            restockItem(itemNames, itemQuantities, target, amount);
        }

        // 3 to exit 
        else if (choice == 3) {
            System.out.println("Exiting program.");
            break; // Break out of the while(true) loop
        }

        // Any other number = invalid
        else {
            System.out.println("Invalid option.");
        }
}

    // Close the Scanner to prevent resource leaks
    sc.close();

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

    //restocks items in the stock array based on the item name and amount to restock.


public static void restockItem(String[] names, int[] stocks, String target, int amount)
{
    boolean found = false;

// this method loops through the names array to find the target
    for (int i = 0; i < names.length; i++)
    {
        if (names[i] != null && names[i].equalsIgnoreCase(target))
        {
            stocks[i] += amount;
            // If the item is found, the specified amount is added to its stock.
            System.out.println(target + " amount restocked " + amount + ". New stock: " + stocks[i]);
            found = true;
            break;
        }
    }

    if (!found)
    {  
         //If the item is not found after checking all entries, a message is printed.
        System.out.println("Item not found.");
    }
}
}

