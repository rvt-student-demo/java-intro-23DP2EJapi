package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(double capacity, String name){
        super(capacity);

        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String toString(){
        return this.name + ":" + super.toString();
    }
}
