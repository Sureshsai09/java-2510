
public class EMICalculator {
    public static void main(String[] args) {
        double onRoadPrice = 800000;        // Total cost of vehicle
        double downPayment = 100000;        // Initial payment
        double annualInterestRate = 9.5;    // Annual interest rate in percent
        int loanPeriodYears = 5;            // Loan duration in years

        // Step 2: Calculate principal (Loan amount)
        double principal = onRoadPrice - downPayment;  // P

        // Step 3: Monthly interest rate (R)
        double monthlyRate = annualInterestRate / (12 * 100);

        // Step 4: Loan tenure in months (N)
        int tenureMonths = loanPeriodYears * 12;

        // Step 5: Calculate (1 + R)^N using Math.pow()
        double powerTerm = Math.pow(1 + monthlyRate, tenureMonths);

        // Step 6: Apply EMI formula
        double emi = (principal * monthlyRate * powerTerm) / (powerTerm - 1);

        // Step 7: Optional – Total interest and payment
        double totalPayment = emi * tenureMonths;
        double totalInterest = totalPayment - principal;

        // Step 8: Display the results
        System.out.println("     EMI CALCULATOR       ");
        System.out.println("Loan Amount        : " + principal);
        System.out.println("Loan Period        : " + loanPeriodYears + " years (" + tenureMonths + " months)");
        System.out.println("Monthly Interest   : " + monthlyRate);
        System.out.println("                            ");
        System.out.println("Monthly EMI        : " + emi);
        System.out.println("Total Interest     : " + totalInterest);
        System.out.println("Total Payment      : " + totalPayment);
    }
}

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter loan amount (P): ");
    //     double P = scanner.nextDouble();

    //     System.out.print("Enter annual interest rate (R) in %: ");
    //     double annualR = scanner.nextDouble();

    //     System.out.print("Enter tenure (N) in months: ");
    //     int N = scanner.nextInt();

        
    //     double R = annualR / (12 * 100);

    //     // Calculate EMI
    //     double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);

    //     System.out.printf("EMI is: %.2f%n", emi);

    //     scanner.close();