package lv.rvt;

public class Box implements Packable {
    private double maxWeight;
    private int count;
    private double weight;

    public Box(int x){
        this.maxWeight = x;
    }
    @Override
    public double weight() {
        
        return this.weight;
    }

    public void add(Book a){
      this.maxWeight = this.maxWeight - a.weight();
      this.count += 1; 
      this.weight = this.weight + a.weight();

    }
    public void add(CD a){
        this.maxWeight = this.maxWeight - a.weight();
        this.count += 1; 
        this.weight = this.weight + a.weight();
  
      }

      public void add(Box a){
        this.maxWeight = this.maxWeight - a.weight();
        this.count += 1; 
        this.weight = this.weight + a.weight();
  
      }

      @Override
    public String toString(){
        return "Box:" + this.count + " items, total weight " + this.weight + " kg";
    }

}
