import java.util.Scanner; //import Scanner

//Represents the process of checking product to be distributed to customer
public class Distribution {
    Scanner input = new Scanner(System.in); // for user input in product quantity

    public void distributeProduct() {

        Inventory inventoryObj = new Inventory();
        System.out.print("Enter the product quantity: ");// ask for product quantity

        int amount = input.nextInt();

        // subtracting the current Inventory Status(product quantity)
        // to the product quantity inputed by the user
        inventoryObj.setInventoryStatus(inventoryObj.getInventoryStatus() - amount);

    } // end of distributeProduct() method
}
