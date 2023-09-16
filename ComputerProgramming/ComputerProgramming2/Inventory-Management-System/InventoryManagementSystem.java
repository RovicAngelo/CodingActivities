
//System.java
// Represents the system in warehouse
import java.util.Scanner;//import Scanner

//Represents the System of the warehouse
//constant corresponding to menu option
public class InventoryManagementSystem {
    Distribution distribution = new Distribution();
    Receiving receiving = new Receiving();
    Inventory inventory = new Inventory();
    InventoryInquiry inventoryInquiry = new InventoryInquiry();

    // for user menu selection
    Scanner userInput = new Scanner(System.in);

    public void MainMenu() {
        System.out.println("Main Menu");
        System.out.println("0    - Inventory Inquiry");
        System.out.println("1    - Receiving");
        System.out.println("2    - Distribution ");
        System.out.println("3    - Exit");

        System.out.print("Enter choice : ");// ask for user input in Main menu
        int choice = userInput.nextInt();

        // to determine the user input in the Main menu
        switch (choice) {
            case 0:
                inventoryInquiry.inquire(); // execute Inventory Inquiry
                MainMenu();// return to Main menu
                break;
            case 1:
                receiving.receiveProduct(); // execute Product Receiving
                inventory.updateStatus();// to update the Inventory Status
                MainMenu();// return to Main menu
                break;
            case 2:
                distribution.distributeProduct();// execute Product Distribution
                inventory.updateStatus();// to update the Inventory Status
                MainMenu();// return to Main menu
            case 3:
                break;
            default:
                System.out.println("Invalid Choice,please try again");
                MainMenu();// return to Main menu

        }// end of switch
    }// end of DisplayMainMenu() method

    public static void main(String[] args) {
        Admin adminObj = new Admin();
        adminObj.userLogin();

    }// end of main

}// end of class
