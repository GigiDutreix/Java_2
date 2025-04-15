import java.util.Scanner;

public class SummingItUp {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int T = scanner.nextInt();

     
        for (int i = 0; i < T; i++) {
          
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

        
            int a, b;
            if (num1 < num2) {
                a = num1;
                b = num2;
            } else {
                a = num2;
                b = num1;
            }

          
            int sum = 0;
            for (int j = a; j <= b; j++) {
                sum += j;
            }

        
            System.out.println(sum);
        }

        scanner.close();
    }
}
