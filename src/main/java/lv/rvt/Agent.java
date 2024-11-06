package lv.rvt;

public class Agent {
    private String vards;
    private String uzvards;
    public Agent(String vards, String uzvards){
        this.vards = vards;
        this.uzvards = uzvards;
    }
    public String toString() {
        return "My name is " + this.uzvards +", "+ this.vards+ " " + this.uzvards;
    }



}
