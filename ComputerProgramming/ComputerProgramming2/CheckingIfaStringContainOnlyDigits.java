package TestUrJavaProgrammingSkills;

public class CheckingIfaStringContainOnlyDigits {

  public static void main(String[] args) {
  
  //create string object
  String sample = "54321";
  
  //extract the data out of the object using toCharArray
  char y[] = sample.toCharArray();
  
  //define the length of the string object
  int size = y.length;
  
  int i = 0;
  
  /*while loop ensure that i would travel a long the entire Array
  * and verify if y[i] contains character symbol or integer symbol
  */
  while(i != size) {
  
  /*if y[i] is greater than 0 and less than 9, increment i to the next integer symbol
  * Otherwise print contains not only digits and stop the execution of the loop
  */
    if(y[i] >= '0' && y[i] <= '9') {
      i++;
    }else {
      System.out.println("String 54321 Contain Not only Digits");
      System.exit(0);
    }
  }
  // If the loop end and meet the condition print contains only digits
  System.out.println("String 54321 Contain only Digits");

  }

}
