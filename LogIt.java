import java.util.Scanner;

public class LogIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        int testCases = scanner.nextInt();
   
        for (int i = 0; i < testCases; i++) {
   
            int maxNumber = scanner.nextInt();
            
         
            int maxGuesses = calculateMaxGuesses(maxNumber);
       
            System.out.println(maxGuesses);
        }
        
        scanner.close();
    }
    
    private static int calculateMaxGuesses(int maxNumber) {
     
        double logBase2 = Math.log(maxNumber) / Math.log(2);
        
  
        return (int) Math.ceil(logBase2);
    }
}