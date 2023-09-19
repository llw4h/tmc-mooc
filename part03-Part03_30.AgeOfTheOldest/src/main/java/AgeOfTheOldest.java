
import java.util.Scanner;

public class AgeOfTheOldest {
    /* 
    sebastian,2
    lucas,2
    lily,1
    hanna,5
    gabriel,10
    Age of the oldest: 10 
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
