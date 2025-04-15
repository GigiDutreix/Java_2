import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
       
        int numberOfTestCases = scanner.nextInt();
        
      
        for (int i = 0; i < numberOfTestCases; i++) {
           
            int number = scanner.nextInt();
            
        
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz");
            }
           
            else if (number % 3 == 0) {
                System.out.println("fizz");
            }
            // Check if number is divisible by 5
            else if (number % 5 == 0) {
                System.out.println("buzz");
            }
            
            else {
                System.out.println(number);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}