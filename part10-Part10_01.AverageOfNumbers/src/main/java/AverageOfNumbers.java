
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            
            inputs.add(input);
        }
        System.out.println("average of the numbers: " + average(inputs));

    }
    
    public static double average(ArrayList<String> inputs){
        return inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
    }
}
