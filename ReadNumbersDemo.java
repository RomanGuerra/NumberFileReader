import java.util.*;
import java.io.*;

public class ReadNumbersDemo {

    public static void main(String[] arqs) throws IOException{
        
        System.out.println("This program reads numbers from a file.");

        // Data
        int count = 0;

        // Create List Class
        NumbersList myList = new NumbersList();

        // Open File
        File file = new File("numbers.txt");
        Scanner inputFile = new Scanner(file);

        // Read, Create & Set Number Class
        // hasNextInt() used for input validation
        while(inputFile.hasNextInt()){

            // Read File to String
            String data = inputFile.next();
            // Convert String to Int
            int number = Integer.parseInt(data);
            // Append Int to Linked List
            myList.appendList(number);
         
            // Keep Count
            count++;
        }
        
        // Display Number of Lines Read
        System.out.println("\n" + count + " number(s) read from file.\n");

        // Display List Unsorted
        System.out.print("Unsorted List: ");
        myList.display();

        // Process List
        myList.sort();

        // Display Sorted List
        System.out.print("  Sorted List: ");
        myList.display();
        myList.displayOutput();
    
        // Close File
        inputFile.close();
    }
    
}