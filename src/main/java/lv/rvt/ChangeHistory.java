package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> ChangeHistory;
    public ChangeHistory(){
        this.ChangeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.ChangeHistory.add(status);

    }

    public void clear(){
        this.ChangeHistory.clear();
    }

    public String toString() {
        return this.ChangeHistory.toString();
    }

    public double maxValue() {
        if (this.ChangeHistory.size() == 0) {
            return 0;
        }
        double largest = 0;
        for (double value: this.ChangeHistory){
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    public double minValue() {
        if (this.ChangeHistory.size() == 0) {
            return 0;
        }
        double smalest = 0;
        for (double value: this.ChangeHistory){
            if (value < smalest) {
                smalest = value;
            }
        }

        return smalest;
    }

    public double average(){
        if (this.ChangeHistory.size() == 0) {
            return 0;
        }
        

    }

}
