package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average;
    private int sumeven;
    private int sumodd;

    public Statistics(){
        this.count = 0;
        this.sum = 0;
        this.average = 0;
        this.sumeven = 0;
        this.sumodd = 0;

    }

    public void addNumber(int number){
        this.count += 1;
        this.sum = this.sum + number;
        if (number % 2 == 0) {
            this.sumeven = this.sumeven + number;   
        }
        else{
            this.sumodd = this.sumodd + number;
        }

    }
    public int sumeven(){
        return this.sumeven;
    }
    public int sumodd(){
        return this.sumodd;
    }
    public int getCount() {
        
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {

        this.average = this.sum * 1.0 / this.count;
        return  this.average;
    }

}
