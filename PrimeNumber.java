import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args)   

{
Scanner input = new Scanner(System.in);
int numCases = input.nextInt();

for (int i = 0; i < numCases; i++)
{    boolean isPrime = true;
    int numToCheck = input.nextInt();
    input.nextLine(); 

    for ( int j=2; j < numToCheck; j++)
    {
        if (numToCheck % j == 0)
        { isPrime = false;
            break;
        }


    }  System.out.println(isPrime);
} 



}
}