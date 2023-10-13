
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        if (this.elements.isEmpty()){
            return String.format("The collection %s is empty.", this.name);
        }
        if (this.elements.size() == 1){
            return String.format("The collection %s has %s element:\n%s", this.name, 1, this.elements.get(0));
        }
        String values = "";
        for (String e : this.elements){
            values += e + "\n";
        }
        return String.format("The collection %s has %s elements:\n%s", this.name, this.elements.size(), values);
    }
    
}
