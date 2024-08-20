import java.util.Scanner;

public class it24100603Lab4Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number from the user
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
