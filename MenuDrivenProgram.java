import java.util.Scanner;

public class MenuDrivenProgram {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = 0;
        
        while (choice != 3) {
            displayMenu();
            choice = getMenuChoice();
            handleMenuChoice(choice);
        }
        
        scanner.close();
    }
    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }
    
    public static int getMenuChoice() {
        int choice = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter your choice (1-3): ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        
        return choice;
    }
    
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }
    
    public static void checkEvenOrOdd() {
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Not an integer.");
            scanner.next(); // Clear invalid input
        }
    }
}