import java.util.Scanner;

public class InvalidInputValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validAge = 20; // Last valid state

        System.out.println("Current valid age: " + validAge);

        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();

        // Validate input
        if (newAge >= 0 && newAge <= 100) {
            validAge = newAge;
            System.out.println("Valid input accepted.");
        } else {
            System.out.println("Invalid input rejected.");
            System.out.println("Last valid state remains unchanged.");
        }

        System.out.println("Current age: " + validAge);

        sc.close();
    }
}