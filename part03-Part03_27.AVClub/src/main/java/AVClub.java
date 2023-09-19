
import java.util.Scanner;

public class AVClub {
    public static void splitString(String input) {
        String[] pieces = input.split(" ");
        containAV(pieces);
    }

    public static void containAV(String[] pieces) {
        for (String i : pieces) {
            if (i.contains("av")) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            splitString(input);
        }

    }
}
