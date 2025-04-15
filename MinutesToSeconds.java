import java.util.Scanner;
public class MinutesToSeconds {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int minute = input.nextInt();
        int second = minute * 60;
        System.out.println(second);
        input.close();

    }

}
