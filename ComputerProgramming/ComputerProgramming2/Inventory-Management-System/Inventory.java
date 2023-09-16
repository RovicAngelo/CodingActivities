//Inventory.java
// Represents the Inventory in warehouse
public class Inventory {

    private static int InventoryStatus; // initial value of the inventory in warehouse

    private final static int INVENTORY_CAPACITY = 1000; // constant variable to set the inventory capacity

    public int getInventoryStatus() {
        return InventoryStatus;
    }// end of getInventoryStatus() method

    public void setInventoryStatus(int newStatus) {
        InventoryStatus = newStatus;
    }// end of setInventoryStatus() method

    public void updateStatus() {

        // put the conditions
        if (InventoryStatus <= 0) {
            System.out.println("Inventory Status: " + getInventoryStatus());
            System.out.println("Inventory Capacity : " + INVENTORY_CAPACITY);

            // multiplying the product quantity to the unit price per product(200 pesos)
            System.out.println("Total amount : " + getInventoryStatus() * 200 + " pesos");
            System.out.println("No product in Inventory!!!");

        } else if (InventoryStatus <= 250) {
            System.out.println("Inventory Status: " + getInventoryStatus());
            System.out.println("Inventory Capacity : " + INVENTORY_CAPACITY);

            // multiplying the product quantity to the unit price per product(200 pesos)
            System.out.println("Total amount : " + getInventoryStatus() * 200 + " pesos");
            System.out.println("Low Inventory");
        } else if (InventoryStatus <= 800) {
            System.out.println("Inventory Status: " + getInventoryStatus());
            System.out.println("Inventory Capacity : " + INVENTORY_CAPACITY);

            // multiplying the product quantity to the unit price per product(200 pesos)
            System.out.println("Total amount : " + getInventoryStatus() * 200 + " pesos");
            System.out.println("Normal Inventory");
        } else if (InventoryStatus <= 999) {
            System.out.println("Inventory Status: " + getInventoryStatus());
            System.out.println("Inventory Capacity : " + INVENTORY_CAPACITY);

            // multiplying the product quantity to the unit price per product(200 pesos)
            System.out.println("Total amount : " + getInventoryStatus() * 200 + " pesos");
            System.out.println("Near full Inventory");
        } else if (InventoryStatus >= INVENTORY_CAPACITY) {
            System.out.println("Inventory Status: " + getInventoryStatus());
            System.out.println("Inventory Capacity : " + INVENTORY_CAPACITY);

            // multiplying the product quantity to the unit price per product(200 pesos)
            System.out.println("Total amount : " + getInventoryStatus() * 200 + " pesos");
            System.out.println("Full Inventory, Please remove some product");
        } else {
            System.out.println("Invalid key");
        } // end else if statement

    }// end of updateStatus() method

} // end class Inventory