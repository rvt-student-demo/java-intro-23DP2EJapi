package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory productHistory;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);
        this.productHistory = new ChangeHistory();
        this.productHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.productHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountGot = super.takeFromWarehouse(amount);
        this.productHistory.add(super.getBalance());
        return amountGot;
    }
    
    public String history() {
        return this.productHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.productHistory.toString());
        System.out.println("Largest amount of product: " + this.productHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.productHistory.minValue());
        System.out.println("Average: " + this.productHistory.average());
    }
}