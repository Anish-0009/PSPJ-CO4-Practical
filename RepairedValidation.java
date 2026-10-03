import java.util.Scanner;

public class RepairedValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validAge = 20; // Last known valid state

        System.out.println("Before repair:");
        System.out.println("Current valid age: " + validAge);

        System.out.print("Enter a new age: ");
        int newAge = sc.nextInt();

        // Repaired validation
        if (newAge >= 0 && newAge <= 100) {
            validAge = newAge;
            System.out.println("Valid input accepted.");
        } else {
            System.out.println("Invalid input rejected safely.");
            System.out.println("Cause: Age must be between 0 and 100.");
            System.out.println("Last valid state remains unchanged.");
        }

        System.out.println("\nAfter repair:");
        System.out.println("Current age: " + validAge);

        sc.close();
    }
}