import java.util.Scanner;

public class RSAPublicKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int numTestCases = scanner.nextInt();
       
        int caseNumber = 0;
        while (caseNumber < numTestCases) {
            long p = scanner.nextLong();
            long q = scanner.nextLong();
            long e = scanner.nextLong();
       
            boolean isPPrime = true;
            if (p <= 1) {
                isPPrime = false;
            } else {
                long i = 2;
                while (i * i <= p) {
                    if (p % i == 0) {
                        isPPrime = false;
                        break;
                    }
                    i++;
                }
            }
         
            boolean isQPrime = true;
            if (q <= 1) {
                isQPrime = false;
            } else {
            
                long i = 2;
                while (i * i <= q) {
                    if (q % i == 0) {
                        isQPrime = false;
                        break;
                    }
                    i++;
                }
            }
   
            if (!isPPrime || !isQPrime) {
                System.out.println("Invalid n for RSA Key!");
            } else {
              
                long n = p * q;
                long totient = (p - 1) * (q - 1);
                
              
                boolean isEValid = true;
                
              
                if (e <= 1 || e >= totient) {
                    isEValid = false;
                } else {
                    long a = e;
                    long b = totient;
                  
                    while (b != 0) {
                        long remainder = a % b;
                        a = b;
                        b = remainder;
                    }
                    
                    if (a != 1) {
                        isEValid = false;
                    }
                }
                
                if (!isEValid) {
                    System.out.println("Invalid e for RSA Key!");
                } else {
                    System.out.println("RSA Public Key: n=" + n + " e=" + e);
                }
            }
            
            caseNumber++;
        }
        
        scanner.close();
    }
}