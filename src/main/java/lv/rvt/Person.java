package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    //Class constructor
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, weight " + this.weight + "kg " + ", height " + this.height + "cm";
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder(){
        this.age = this.age + 1;
    }
    public void growOlder(int years){
        this.age = this.age + years;
    }

    public int returnAge(){
        return this.age;
    }
    public int getWeight(){
        return this.weight;
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

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public String toCsvRow(){
     return this.name + ", " + this.age + ", " + this.weight + ", " +this.height;
    }



}

