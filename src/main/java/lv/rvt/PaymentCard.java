package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public double balance() {
        return this.balance;
    }


    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance - 2.6 >= 0) {
            
        
        this.balance = this.balance - 2.6;
    }
    


    }
    
    public void eatHeartily() {
        if (this.balance - 4.6 >= 0) {
            
       
        this.balance = this.balance - 4.6;
     }
    }
    public void addMoney(double amount) {

        this.balance = this.balance + amount;
        

        
    }
    public boolean takeMoney(double amount){
        if (amount > this.balance) {
            return false;
        }
        this.balance = this.balance - amount;
        return true;
    }


}
