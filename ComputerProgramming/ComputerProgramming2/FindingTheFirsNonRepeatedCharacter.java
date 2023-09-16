package TestUrJavaProgrammingSkills;
  
  import java.util.HashMap;

public class FindingTheFirsNonRepeatedCharacter {

  public static void main(String[] args) {
  
  
  //Input string
    String string = "rockn'roll";
    
  //Create a hashmap to store characters and its frequency
  HashMap<Character, Integer>hashmap = new HashMap<>();
  
  //define the length of the string
  int lengthOfstring = string.length(); 
  
  //iterate one by one
  for (int i=0; i<lengthOfstring; i++) {
  
  /*find individual characters
  *use charAt method to access any character at the index
  */
    Character currentCharacter = string.charAt(i);
    
  /*check if the character is present in hashmap
  *if the character is not present in hashmap then insert a character with a frequency of 1
  *if the character is present in hashmap then increase the frequency by 1
  */
    if(hashmap.containsKey(currentCharacter) ==false){
      hashmap.put(currentCharacter, 1);
    } else {
      int currentFreq = hashmap.get(currentCharacter);currentFreq++;
      hashmap.put(currentCharacter, currentFreq);
    }
  }
  
  //using boolean to check if there's a non repeating character or not
  boolean noRepeatingFound = false;
  
  /*after traversing to string and define the character
  *traverse again to the string to check if character's frequency is 1 or not
  */
  for(int i=0; i <lengthOfstring; i++) {
    
    Character currentCharacter = string.charAt(i);
    int currentFreq = hashmap.get(currentCharacter);
    
  //if a character have only 1 frequency then it is the first non repeated character
    if(currentFreq == 1) {
      System.out.println(currentCharacter);
      noRepeatingFound = true;
      break;
    }
  }
  
  /*if there's no repeating character found,
  *just print There's no repeating character in the given string
  */
  if(noRepeatingFound == false) {
    System.out.println("There's no repeating character in the given string");
  }

  }

}
