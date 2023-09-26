
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                list.add(Integer.valueOf(scanFile.nextLine()));
            }
            int count = 0;
            for(int l : list){
                if (l >= lowerBound && l <= upperBound){
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
