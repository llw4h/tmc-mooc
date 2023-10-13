
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        

        while (true) {
            System.out.print("First: " + first +"/100\nSecond: " + second + "/100\n");

            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0){
                    continue;
            }
            
            if (command.equals("add")){
                first += amount;
                if (first > 100){
                    first = 100;
                }
            } else if (command.equals("move")){
                if (amount <= first){
                    second += amount;
                    first -= amount;
                } else {
                    second += first;
                    first = 0;
                }
                if (second > 100){
                    second = 100;
                }
            } else if (command.equals("remove")){
                second -= amount;
                if (second < 0){
                    second = 0;
                }
            } else {
                System.out.println("Unknown command");
            }
            
            
            
        }
    }

}
