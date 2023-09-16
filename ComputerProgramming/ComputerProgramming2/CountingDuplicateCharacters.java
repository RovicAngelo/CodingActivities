package TestUrJavaProgrammingSkills;

//Using HashMap to count duplicate character
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters {

  public static void main(String[] args) {
 
  //input string
  String stringName = "angelolanuza";
  
  //Create an empty HashMap object
  HashMap<Character, Integer> map = new HashMap<>();
  
  //count string length
  int length = stringName.length();
  
  //iterate one by one
  for(int i = 0; i < length; i++) {
    char ch = stringName.charAt(i);
    
    if(map.containsKey(ch))
    map.put(ch, map.get(ch) + 1);
     else
     map.put(ch, 1);
  }
  
  //iterate map and show output
  for(Map.Entry<Character, Integer> entry : map.entrySet()) {
    System.out.println("Key : "+ entry.getKey() + ", Value : " + entry.getValue());
    
  }
   
  }
}
