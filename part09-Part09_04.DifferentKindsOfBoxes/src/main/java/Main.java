

public class Main {

    public static void main(String[] args) {
        // You can test your program here
        Item first = new Item("Rock", 5);
        Item second = new Item("Rock", 1);
        System.out.println(first.hashCode() == second.hashCode());
    }
}
