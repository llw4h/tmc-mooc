
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        
        if (!(obj instanceof Item)){
            return false;
        }
        
        Item compared = (Item) obj;
        
        if (this.name.equals(compared.name)){
            return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
        return this.weight;
        }

        return this.name.hashCode();
    }
    
    
}
