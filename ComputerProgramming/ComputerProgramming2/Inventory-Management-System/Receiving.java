import java.util.Scanner;//import Scanner

//Represents the process of receiving product to be store in warehouse
public class Receiving {

    Scanner input = new Scanner(System.in);// for user input of product quantity to be receive

    public void receiveProduct() {
        Inventory inventoryObj = new Inventory();

        System.out.print("Enter the product quantity: ");// ask for product quantity
        int amount = input.nextInt();

        // adding the current Inventory Status(product quantity)
        // to the product quantity inputed by the user
        inventoryObj.setInventoryStatus(inventoryObj.getInventoryStatus() + amount);

    }// end of receiveProduct() method

} // end class Receiving