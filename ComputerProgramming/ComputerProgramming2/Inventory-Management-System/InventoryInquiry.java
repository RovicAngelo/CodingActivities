//InventoryInquiry.java
// Represents the Inventory Inquiry
public class InventoryInquiry {

    Inventory inventory = new Inventory();

    public void inquire() {

        System.out.println("\n" + "---------------------Inventory------------------------");
        System.out.println("Product description : Cheese Big 1kg");
        System.out.println("Unit price = 200 pesos");
        inventory.updateStatus();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }// end of inquire() method
} // end class InventoryInquiry