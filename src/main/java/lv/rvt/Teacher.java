package lv.rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String addres, int salary){
        super(name, addres);
        this.salary = salary;
    }

    public int credits(){
        return this.salary;
    }
 
    public void study(){
        this.salary = this.salary + 1;
    }

    public String toString() {
        return String.format( this.name + " \n   " + this.addres + " \n   salary " + this.salary + " euro/month");
    }

}