
import java.util.Scanner;
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        
//        String input = "The Ringing Lullaby Book\n" + "0\n"
//                + "The Exiting Transpotation Vehicles\n" + "0\n"
//                + "The Snowy Forest Calls\n" + "12\n"
//                + "Litmanen 10\n" + "10\n" + "\n";
                
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(input);
        
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            
            if (title.equals("")){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, ageRecommendation));
         
        }
        
        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);
        
        Collections.sort(books, comparator);
        
        System.out.println("\nBooks:");
        books.stream()
                .map(book -> book.toString())
                .forEach(book -> System.out.println(book));
    }

}
