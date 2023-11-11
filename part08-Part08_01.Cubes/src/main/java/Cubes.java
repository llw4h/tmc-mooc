
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            try {
                System.out.println((int)Math.pow(Integer.valueOf(input), 3));
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
