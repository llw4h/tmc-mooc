
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics grade = new GradeStatistics();
        
        UserInterface ui = new UserInterface(scanner, grade);
        ui.start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
