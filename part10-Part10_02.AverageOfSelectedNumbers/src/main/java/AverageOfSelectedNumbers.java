
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("end")){
                break;
            }
            
            inputs.add(input);
        }
        
        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine().toLowerCase();
        
        if (choice.equals("p")){
            System.out.println("Average of the positive numbers: " + averagePositive(inputs));
        } else if (choice.equals("n")){
            System.out.println("Average of the negative numbers: " + averageNegative(inputs));
        } else {
            System.out.println("unknown command");
        }
        
    }
    
    public static double averagePositive(ArrayList<String> inputs){
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
    }
    
    public static double averageNegative(ArrayList<String> inputs){
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
    }
    
    
}
