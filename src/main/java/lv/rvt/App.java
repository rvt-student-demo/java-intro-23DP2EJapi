package lv.rvt;

import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;



public class App 
{
    public static void main( String[] args) throws  Exception {
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

        Person person = new Person("Peteris", 80, 946, 15);
        PersonManager.addPersons(person);
        Timer timer = new Timer();

while (true) {
    System.out.println(timer);
    timer.advance();

    try {
        Thread.sleep(10);
    } catch (Exception e) {

    }
}
            
    }

}
