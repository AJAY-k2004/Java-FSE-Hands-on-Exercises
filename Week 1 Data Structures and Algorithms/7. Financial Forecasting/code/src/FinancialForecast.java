public class FinancialForecast {

    
    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    
    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.07; 
        int years = 6;

        double recursiveResult = forecastRecursive(initialValue, growthRate, years);
        System.out.println("Recursive Future Value: " + recursiveResult);

        double iterativeResult = forecastIterative(initialValue, growthRate, years);
        System.out.println("Iterative Future Value: " + iterativeResult);
    }
}
