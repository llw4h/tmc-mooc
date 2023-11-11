
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer first = new LiquidContainer("First");
        LiquidContainer second = new LiquidContainer("Second");

        while (true) {
            System.out.println(first.toString());
            System.out.println(second.toString());
            System.out.print("> ");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                first.addLiters(amount);
                
            } else if (command.equals("move")){
                if (amount > first.getLiters()){
                    amount = first.getLiters();

                }
                first.removeLiters(amount);
                second.addLiters(amount);
                
            } else if (command.equals("remove")){
                second.removeLiters(amount);
                
            } else {
                System.out.println("Unknown command");
            }
            
            System.out.println("");
        }
    }

}
