
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                if (age == 1){
                    System.out.println(String.format("%s, age: %s year",name,age));
                } else {
                    System.out.println(String.format("%s, age: %s years",name,age));
                }
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
