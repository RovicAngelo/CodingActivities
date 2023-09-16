package Activities;
//Import Scanner class for user input
import java.util.Scanner;
public class vendingMachine {
 
 //Scanner Class as Global Variable
 static Scanner userInput = new Scanner(System.in);
    
    /*Method to display products and products price in Vending Machine 
    And customer's product selection 
    */
    static void productDisplay() {
    System.out.println("productNumber  Product      price");
    System.out.println("[1]            Maxx       : $10.35 ");
    System.out.println("[2]           Clover      : $65.15 ");
    System.out.println("[3]        Big Sweat Gum  : $16.50 ");
    System.out.println("[4]            Oreo       : $120.72 ");
  }
  
 static double productNumber() {
  double price = 0;
  
       System.out.print("Enter product number: ");
    String productnumber = userInput.next().toUpperCase();
      
     if(productnumber.equals("1")) {
      price = 10.35;
      return 10.35;
       }else if(productnumber.equals("2")) {
       price = 65.15;
       return 65.15;
       }else if(productnumber.equals("3")) {
       price = 16.50;
       return 16.50;
       }else if(productnumber.equals("4")) {
       price = 120.72;
       return 120.72;
       
       }else {
      //Using system.exit() to stop the flow of the code if the customer input number greater than the available product number
      System.exit(0);
      return price;
      }
    
  }
    //Method to accept money from the customer
     static void enterMoney() {
      System.out.print("Enter Money:");
      double moneyInserted = userInput.nextDouble();
      //storing the method productNumber to the variable candyPrice
      double candyPrice = productNumber();
      calculateMoney(moneyInserted, candyPrice);
  }
       /*method to calculate the customer's money minus product price
    to release the item,to verify if customer wants to buy again,
    and to return the money to customer if it is not enough
    */
  static void calculateMoney(double moneyInserted, double candyPrice) {
  if(moneyInserted > candyPrice) {
  double moneyChange = moneyInserted - candyPrice;
  System.out.println("Here's your product");
  System.out.println("Here's your change $" + moneyChange);
  System.out.println("Do you want to purchase again? type yes or no");
  String YesOrNo2 = userInput.next().toLowerCase();
  //Can continue buying as long as customer typed valid key by calling the method enterMoney()
   if(YesOrNo2.equals("yes")) enterMoney();
   else {
   System.out.println("Here's your change " + moneyChange);
   System.out.println("Thank you, Come Again");
   }
   }else System.out.println("Not enough Money");
  }

  public static void main(String[] args) {
  //Welcome statement to customer
  System.out.println("Welcome to Lanuza's Candy Machine");
  //Ask the customer if she/he wants to buy
  System.out.println("Do you want to make a purchase? type yes or no");
   String YesOrNo1 = userInput.next().toLowerCase();
   
   if(YesOrNo1.equals("yes")) {
   //Calling the method to show the product in vending machine
   productDisplay();
   //Calling the method to accept money from customer
   enterMoney();
   }else if(YesOrNo1.equals("no")) System.out.println("Okay:(");
   else System.out.println("Invalid Key");  
  }
}
