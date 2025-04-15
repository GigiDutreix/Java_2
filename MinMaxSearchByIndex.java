import java.util.Scanner;

public class MinMaxSearchByIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        int T = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < T; i++) {
            String line = scanner.nextLine();  
            Scanner lineScanner = new Scanner(line); 

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            System.out.println(line);
            while (lineScanner.hasNextInt()) {
                int num = lineScanner.nextInt();
               
               
                if (num < min) {
                    min = num;  
                }
                if (num > max) {
                    max = num;  
                }
            }

            System.out.println(min);
            System.out.println(max);
            System.out.println();  

            lineScanner.close();  
        }

        scanner.close();  
    }
}