import java.util.Scanner;

public class BankOpersations {

    // Method to calculate power using basic operators (loop)
    public static double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Method to calculate EMI
    public static double calculateEMI(double principal, double annualRate, int tenureMonths) {
        double monthlyRate = annualRate / (12 * 100);
        double numerator = principal * monthlyRate * power(1 + monthlyRate, tenureMonths);
        double denominator = power(1 + monthlyRate, tenureMonths) - 1;
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in %: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter tenure (N) in months: ");
        int tenureMonths = scanner.nextInt();

        double emi = calculateEMI(principal, annualRate, tenureMonths);

        System.out.printf("EMI is: %.2f%n", emi);

        scanner.close();
    }
}
