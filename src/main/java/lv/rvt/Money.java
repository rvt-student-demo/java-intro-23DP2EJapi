package lv.rvt;

public class Money {

    private int euros;
    private int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money(Money nauda){
        this.euros = nauda.euros();
        this.cents = nauda.cents();
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition); // create a new Money object that has the correct worth
        Money afterPlus = new Money(newMoney.euros() + this.euros, newMoney.cents() +this.cents);
        // return the new Money object
        if (afterPlus.cents >99) {
            afterPlus.euros++ ;
            afterPlus.cents -= 100;
        }
        return afterPlus;
    }

 

    public boolean lessThan(Money compared){
        if (this.euros > compared.euros() ) {
            return false;
        } else if (compared.euros() > this.euros) {
            return true;
        } else if (compared.euros() == this.euros && compared.cents() > this.cents) {
            return true;
        } else if (compared.euros() == this.euros && compared.cents() < this.cents) {
            return false;
        } else{
            return false;
        }
    }
    public Money minus(Money decreaser){
        Money AfterMinus = new Money(this.euros - decreaser.euros(), this.cents - decreaser.cents());
        Money Helpper = new Money(1, 0);
        Money Helpper2 = new Money(0, 100);
        if (AfterMinus.cents < 0) {
            AfterMinus.euros -= 1;
            AfterMinus.cents += 100;            
        }

        Money nullMoney = new Money(0, 0);
        if(AfterMinus.cents() < nullMoney.cents() && AfterMinus.euros() < nullMoney.euros() ){
            return nullMoney;
        }
      return AfterMinus;
    }

  


}