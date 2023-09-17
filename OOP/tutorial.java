import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class tutorial {
    public static void main(String args[]) {

        // Initalize an empty queue
        Queue<String> movieLine = new ArrayDeque<>();

        // Adding people from user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String newName = userInput.nextLine();
        movieLine.add(newName);

        // add name of people in the queue
        movieLine.add("Spongebob");
        movieLine.add("Patrick");
        movieLine.add("Squidward");

        // printing the names
        System.out.println("People in the line:");
        System.out.println(movieLine);

        System.out.println();
        // remove the person in the front of the queue
        System.out.println(movieLine.poll() + " exited the line");// remove()
        System.out.println(movieLine.peek() + " is now in the front line");// element()
        
        System.out.println();
        System.out.println(movieLine);

        System.exit(0);
        userInput.close();
    }
}