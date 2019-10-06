package Client;

import java.util.Scanner; 

public class Client {
    
    public int selectDBTool () {
        // Query user to select a storage algorithm
        System.out.println("Please select a database software:");
        System.out.println("1. Relational");
        System.out.println("2. NoSQL");
        System.out.println("3. Graph");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput;
    }
    
    public void processDBDecision(Store strategy, String otherOptions){
        // Processes the request of the client.
        System.out.println("In processDBDecision() method.");
        System.out.println("----------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to change the default algorithm? (Y or N)");
        String userInput = scan.next().toUpperCase();
        // If client wants default
        if (userInput.equals("N")) {
                strategy.store();
        }
        // If client wants something different.
        else if (userInput.equals("Y")) {
                System.out.println(otherOptions);
                String change = scan.next();
                change = change.toLowerCase();
                strategy.setStoreStrategy(change);
        }
    }
        
    public static void main(String[] args) {
        System.out.println("In Main() Method");
        System.out.println("----------------");
        Client Derek = new Client();
        int userInput = Derek.selectDBTool();
        
        // Based on which one the client selects process the request
        if (userInput == 1) {
                Store strategy = new Relational();
                String otherOptions = "Document or Node storage type?";
                Derek.processDBDecision(strategy, otherOptions);

        }
        else if (userInput == 2) {
                Store strategy = new NoSQL();
                String otherOptions = "Table or Node storage type?";
                Derek.processDBDecision(strategy, otherOptions);
        }
        else if (userInput == 3) {
                Store strategy = new Graph();               
                String otherOptions = "Table or Document storage type?";
                Derek.processDBDecision(strategy, otherOptions);
        }
        else {
                System.out.println("Invalid selection");
        }
    }

}
