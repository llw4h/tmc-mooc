
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream()
                .forEach(str -> System.out.println(str));
    }
}
