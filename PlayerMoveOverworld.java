import java.util.Scanner;
public class PlayerMoveOverworld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numTestCases; i++) {
            // Read starting position
            String[] position = scanner.nextLine().split(" ");
            int x = Integer.parseInt(position[0]);
            int y = Integer.parseInt(position[1]);
            
            // Read moves on next line
            String moves = scanner.nextLine();
            
            // Process each move
            for (int j = 0; j < moves.length(); j++) {
                char move = moves.charAt(j);
                if (move == 'w') {
                    y--;
                } else if (move == 'a') {
                    x--;
                } else if (move == 's') {
                    y++;
                } else if (move == 'd') {
                    x++;
                }
                // Ignore spaces and other characters
            }
            
            System.out.println(x + " " + y);
        }
        
        scanner.close();
    }
}