package lv.rvt;

public class Counter {
    private int value;

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value = this.value - 1;
        }
        
    }

    public void reset(){
        this.value = 0;

    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value = this.value + 1;
    }
    public void decrease(){
        this.value = this.value - 1;
    }
    public void increase(int increaseBy){
        this.value = this.value + increaseBy;
    }
    public void decrease(int decreaseBy){
        this.value = this.value - decreaseBy;
    }



}
