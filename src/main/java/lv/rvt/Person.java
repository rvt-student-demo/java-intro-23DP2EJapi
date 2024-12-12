package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private int height;
    private SimpleDate birthday;



    //Class constructor
    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, SimpleDate bday, int height, double weight) {
        this.name = name;
        this.birthday = bday;
        this.weight = weight;
        this.height = height;

    }
    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name == comparedPerson.name
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.birthday.getYear() == comparedPerson.birthday.getYear()
                && this.birthday.getMonth() == comparedPerson.birthday.getMonth()
                && this.birthday.getDay() == comparedPerson.birthday.getDay()) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
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
    public double getWeight(){
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

    public void setWeight(double newWeight) {
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

