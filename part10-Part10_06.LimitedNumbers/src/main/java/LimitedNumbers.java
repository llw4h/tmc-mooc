
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0){
                break;
            }
            
            inputs.add(input);
        }
        
       limitedNumbers(inputs);
    }
    
    public static void limitedNumbers(List<Integer> inputs){
        inputs.stream()
                .filter(number -> number > 0 && number < 6)
                .forEach(number -> System.out.println(number));
    }
}
