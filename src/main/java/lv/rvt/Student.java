package lv.rvt;

public class Student extends Person {
    private int StudyCredit;

    public Student(String name, String addres){
        super(name, addres);
        this.StudyCredit = 0;
    }

    public int credits(){
        return this.StudyCredit;
    }
 
    public void study(){
        this.StudyCredit = this.StudyCredit + 1;
    }

    public String toString() {
        return String.format( this.name + " \n   " + this.addres + " \n   Study credits " + this.StudyCredit);
    }

}
