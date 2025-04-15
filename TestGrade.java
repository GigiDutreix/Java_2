import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int grade = scanner.nextInt();

     
        char letterGrade;

       
        if (grade == 100) {
            letterGrade = 'A';
        } else {
            
            int key = grade / 10;

            switch (key) {
                case 9:  // 90-99
                    letterGrade = 'A';
                    break;
                case 8:  // 80-89
                    letterGrade = 'B';
                    break;
                case 7:  // 70-79
                    letterGrade = 'C';
                    break;
                case 6:  // 60-69
                case 5:  // 50-59
                    letterGrade = 'D';
                    break;
                default: // Below 50 or invalid input
                    if (grade >= 0 && grade < 50) {
                        letterGrade = 'F';
                    } else {
                        letterGrade = '?'; // Invalid grade
                    }
                    break;
            }
        }

        // Print the resulting letter grade
        System.out.println(letterGrade);

        scanner.close();
    }
}
