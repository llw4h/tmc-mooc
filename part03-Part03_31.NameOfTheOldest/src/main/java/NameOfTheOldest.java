
import java.util.Scanner;

public class NameOfTheOldest {
    /* 
     sebastian,2
    lucas,2
    lily,1
    hanna,5
    gabriel,10

    Name of the oldest: gabriel
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
            System.out.println("Name of the oldest: " + name);
    }
}
