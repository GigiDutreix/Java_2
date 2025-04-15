import java.util.Scanner;
public class AreaOfASquare {
    public static void main(String[] args)
    {
Scanner input = new Scanner(System.in);
int length = input.nextInt();
int area = length * length;
System.out.println(area);
input.close();
    }
    
}