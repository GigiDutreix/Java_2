import java.util.Scanner;

public class AnInterestingProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestCases = input.nextInt();

        for (int i = 0; i < numTestCases; i++) {
         
            double deposit = input.nextDouble();
            double interestRate = input.nextDouble();
            int years = calculateYearsToMillion(deposit, interestRate);
            System.out.println(years + " years");
        }
        
        input.close();
    }
    
    public static int calculateYearsToMillion(double initialDeposit, double interestRate) {
        double balance = initialDeposit;
        double target = 1000000.0;
        int years = 0;
        while (balance < target) {
            balance += balance * (interestRate / 100);
            years++;
        }
        
        return years;
    }
}