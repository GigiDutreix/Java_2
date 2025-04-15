import java.util.Scanner;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int testCases = scanner.nextInt();
        scanner.nextLine(); 
        
        
        for (int i = 0; i < testCases; i++) {
            
            String message = scanner.nextLine();
          
            String dictionaryLine = scanner.nextLine();
            
            String correctedMessage = autocorrect(message, dictionaryLine);
         
            System.out.println(correctedMessage);
        }
        
        scanner.close();
    }
    
    private static String autocorrect(String message, String dictionaryLine) {
       
        String[] dictionaryPairs = dictionaryLine.split(" ");
       
        String correctedMessage = message;
        
        for (int i = 0; i < dictionaryPairs.length; i += 2) {
          
            if (i + 1 < dictionaryPairs.length) {
                String misspelling = dictionaryPairs[i];
                String correction = dictionaryPairs[i + 1];
                
              
                correctedMessage = correctedMessage.replace(misspelling, correction);
            }
        }
        
        return correctedMessage;
    }
}