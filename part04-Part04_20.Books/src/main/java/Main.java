import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")){
                break;
            }            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        for (Book b : books) {
            if (information.equals("everything")){
                System.out.println(b.toString());
            } else if (information.equals("name")) {
                System.out.println(b.getTitle());
            } else {
                break;
            }
        }
    }
}
