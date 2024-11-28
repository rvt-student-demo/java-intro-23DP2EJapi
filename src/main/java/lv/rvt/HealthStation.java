package lv.rvt;

public class HealthStation {
     int x = 0;
 
    public int weigh(Person person) {
        this.x = this.x + 1;
        return person.getWeight() ;
        
        
    }
    public static void feed(Person person){
     person.setWeight(person.getWeight() + 1);
    }
    public int weighings(){
     return this.x;
    }

}
