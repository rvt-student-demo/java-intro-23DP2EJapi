package lv.rvt;

public abstract class Product {
    protected String initialName;
    private String location;
    protected int weight;
    protected double totallprice;

    public Product(int a, double x, String name){
        this.weight = a;
        this.totallprice = x;
        this.initialName = name;


    }

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

public abstract double getAveragePrice (); 

public Product(String name, int weight){
    this.initialName = name;
    this.location = "shelf";
    this.weight = weight ;
}

    public String toString() {
        return this.initialName + "(" + this.weight + " kg)" + " can be found from the " + this.location;
    }

}
