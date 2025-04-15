import java .util.Scanner;
public class TablespoonsToTeaspoons {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tablespoon = input.nextInt();
        int teaspoon = tablespoon * 3;
        System.out.println(teaspoon);
        input.close();

    }

}
