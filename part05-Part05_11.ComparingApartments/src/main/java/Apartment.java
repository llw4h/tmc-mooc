
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares(){
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public int getRooms() {
        return rooms;
    }
    
    public double getPrice(){
        return squares * princePerSquare;
    }
    
    
    public boolean largerThan(Apartment compared){
        if(squares > compared.getSquares()){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        return Math.abs((int)(getPrice() - compared.getPrice()));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(getPrice() > compared.getPrice()){
            return true;
        }
        return false;
    }

}
