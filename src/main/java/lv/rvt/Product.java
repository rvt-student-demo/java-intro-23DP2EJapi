package lv.rvt;

public class Product {
    private String initialName;
    private String location;
    private int weight;

    public Product (String initialName, String location, int initialQuantity){
        this.initialName = initialName;
        this.location = location;
        this.weight = initialQuantity;

    }
    public Product(String name){
        this.initialName = name;
        this.location = "shelf";
        this.weight = 1 ;
    }
public Product(String name, String location){
    this.initialName = name;
    this.location = location;
    this.weight = 1 ;
}
public Product(String name, int weight){
    this.initialName = name;
    this.location = "shelf";
    this.weight = weight ;
}

    public String toString() {
        return this.initialName + "(" + this.weight + " kg)" + " can be found from the " + this.location;
    }

}
