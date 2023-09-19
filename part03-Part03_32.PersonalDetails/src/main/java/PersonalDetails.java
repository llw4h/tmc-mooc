
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {
    /* 
     sebastian,2017
    lucas,2017
    lily,2017
    hanna,2014
    gabriel,2009

    Longest name: sebastian
    Average of the birth years: 2014.8
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int sum = 0;
        int total = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if (pieces[0].length() > longest.length()) {
                longest = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            total++;
        }
        double avg = 1.0 * sum / total;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avg);
    }
}
