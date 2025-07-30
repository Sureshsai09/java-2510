import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in %: ");
        double annualR = scanner.nextDouble();

        System.out.print("Enter tenure (N) in months: ");
        int N = scanner.nextInt();

        
        double R = annualR / (12 * 100);

        // Calculate EMI
        double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);

        System.out.printf("EMI is: %.2f%n", emi);

        scanner.close();
    }
}
