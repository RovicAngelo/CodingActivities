
// Admin.java
// Represents the staff in our warehouse
import java.util.Scanner;//import Scanner

public class Admin {
    public String Username = "username";
    public String Password = "password";
    Scanner loginInput = new Scanner(System.in);

    public void userLogin() {

        InventoryManagementSystem SystemObject = new InventoryManagementSystem();
        System.out.println("Welcome to Product Inventory System");
        System.out.print("Enter Username : ");
        String username = loginInput.nextLine();
        System.out.print("Enter Password : ");
        String password = loginInput.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println();
            SystemObject.MainMenu();
        } else {
            System.out.println("Invalid username or password! Please try again" + "\n");
            userLogin();
        }
    }

} // end class Admin
