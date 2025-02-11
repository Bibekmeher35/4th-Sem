import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundingFrequency = scanner.nextInt();

        // Calculate the accrued interest and final amount
        double amount = principal * Math.pow(1 + (rate / (100 * compoundingFrequency)), compoundingFrequency * time);
        double accruedInterest = amount - principal;

        // Display the results
        System.out.printf("Accrued Interest: %.2f%n", accruedInterest);
        System.out.printf("Final Amount: %.2f%n", amount);

        scanner.close();
    }
}