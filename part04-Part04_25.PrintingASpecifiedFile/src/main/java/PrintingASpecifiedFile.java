
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String textFile = scanner.nextLine();
        try (Scanner scanFile = new Scanner(Paths.get(textFile))){
            while(scanFile.hasNextLine()){
                System.out.println(scanFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
