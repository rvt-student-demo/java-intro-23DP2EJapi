package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        
        if (payment < 2.5) {
            return payment;
        }
        this.affordableMeals = this.affordableMeals + 1;
        this.money = this.money +2.5;
        return payment - 2.5;
    }

    public boolean eatAffordably(PaymentCard card) {
        
        if (card.balance() < 2.5) {
            return false;
        }
        this.affordableMeals = this.affordableMeals + 1;
        card.takeMoney(2.5);

        return true;
    }

    public double eatHeartily(double payment) {
        
        if (payment < 4.3) {
            return payment;
        }
        this.heartyMeals = this.heartyMeals + 1;
        this.money = this.money + 4.3;
        return payment - 4.3;
    }
    public boolean eatHeartily(PaymentCard card) {

        if (card.balance() < 4.3) {
            return false;
        }
        this.heartyMeals = this.heartyMeals + 1;
        card.takeMoney(4.3);

        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money = this.money + sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}


