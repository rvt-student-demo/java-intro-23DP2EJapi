package lv.rvt;

public class Person {
    private String name;
    private int age;

    //Class constructor
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder(){
        this.age = this.age + 1;
    }

    public int returnAge(){
        return this.age;
    }

    public boolean isOfLeagalAge(){
        return this.age >= 18;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }



}

