import java.util.Scanner;

public class TimesTables 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt(); 
        int limit = scanner.nextInt();  
        for (int i = 1; i <= limit; i++) {
            System.out.println(number * i);
        }
        
        scanner.close();

    }
}