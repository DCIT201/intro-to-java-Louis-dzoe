import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu to the user
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        
        // Get user's choice
        int choice = scanner.nextInt();

        // Perform conversion based on the user's choice
        switch (choice) {
            case 1: // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
                break;

            case 2: // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
                break;

            default:
                System.out.println("Invalid choice! Please run the program again and select a valid option.");
        }

        // Close the scanner
        scanner.close();
    }
}
