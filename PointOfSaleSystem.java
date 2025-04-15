import java.util.Scanner;

public class PointOfSaleSystem {
    public static void displayMenu() {
        System.out.println("**********************************************************************");
        System.out.println("McDowell's Restaurant");
        System.out.println("**********************************************************************");
        System.out.println("Make your selection from the menu below:");
        System.out.println("1. Regular Hamburger        $1.50");
        System.out.println("2. Regular Cheeseburger     $1.75");
        System.out.println("3. Fish Sandwich            $2.50");
        System.out.println("4. Half-pounder with cheese $2.75");
        System.out.println("5. French Fries             $0.99");
        System.out.println("6. Large Soft Drink         $1.25");
        System.out.println("***********************************************************************");
        System.out.print("Select 1, 2, 3, 4, 5, or 6 ----- > ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayMenu();
       
        if (input.hasNextInt()) {
            int numOrders = input.nextInt();
            input.nextLine(); 
           
            for (int i = 0; i < numOrders && input.hasNextLine(); i++) {
                double price = 0.0;
                String sequence = input.nextLine();
               
                if (sequence.trim().isEmpty()) {
                    break;
                }
               
                Scanner orders = new Scanner(sequence);
               
                while (orders.hasNextInt()) {
                    int order = orders.nextInt();
                   
                    switch (order) {
                        case 1:
                            price += 1.50;
                            break;
                        case 2:
                            price += 1.75;
                            break;
                        case 3:
                            price += 2.50;
                            break;
                        case 4:
                            price += 2.75;
                            break;
                        case 5:
                            price += 0.99;
                            break;
                        case 6:
                            price += 1.25;
                            break;
                        default:
                           
                            break;
                    }
                }
               
             
                price *= 1.065;
               
                
                System.out.printf("Please pay $%.2f%n", price);
                System.out.println("Thank you for eating at McDowell's!");
               
                
                orders.close();
            }
        }
       
        input.close();
    }
}
