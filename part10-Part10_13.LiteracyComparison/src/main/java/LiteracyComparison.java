
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> lists = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new Literacy(parts[2].replaceAll("\\(%\\)", "").trim(), parts[3].trim(), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(literacy -> lists.add(literacy));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage()); 
        }
        
        lists.stream()
                .sorted()
                .map(list -> list.toString())
                .forEach(list -> System.out.println(list));
    }
}
