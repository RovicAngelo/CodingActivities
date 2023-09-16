package TestUrJavaProgrammingSkills;

import java.util.Arrays;

public class CheckingWhetherTwoStringsAreAnagram {

  public static void main(String[] args) {
  
  // Create two String Object
    String string1 = "Lanuza Rovic";
    String string2 = "civorazunal";

    // Eliminate the blank space by replacing them with empty String
    string1 = string1.replaceAll(" ", "");
    string2 = string2.replaceAll(" ", "");

    // Converts strings to lower case Character
    string1 = string1.toLowerCase();
    string2 = string2.toLowerCase();

    // Using toCharArray method, x and y will be copied in Array a and b
    char a[] = string1.toCharArray();
    char b[] = string2.toCharArray();

    // Sort the Array a and b
    Arrays.sort(a);
    Arrays.sort(b);

    // Compare the Array a and b
    boolean result = Arrays.equals(a, b);

    /*If the result is true then print Strings are Anagram
     *Otherwise print Strings are not Anagram
     */
    if (result == true) System.out.println("Strings are Anagram");
    else System.out.println("Strings are not Anagram");

  }

}
