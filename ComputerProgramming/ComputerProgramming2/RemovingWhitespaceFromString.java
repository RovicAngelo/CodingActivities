package TestUrJavaProgrammingSkills;

public class RemovingWhitespaceFromString {

  public static void main(String[] args) {
  
  //input string with whitespace
  String sentence = "Ro vic A ngelo    Lanuza"; 
  
  //eliminate whitespaces by replacing it with empty string
  sentence = sentence.replaceAll(" ","");
  
  //print output
  System.out.println(sentence);

  }

}
