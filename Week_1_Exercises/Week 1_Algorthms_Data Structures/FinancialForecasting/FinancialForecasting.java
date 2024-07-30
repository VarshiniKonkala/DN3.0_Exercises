package financialForecasting;
public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: If no more years to calculate, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: Calculate value for the next year
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000; // Initial value
        double growthRate = 0.05;   // 5% growth rate
        int years = 10;             // Number of years

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f\n", years, futureValue);
    }
}
