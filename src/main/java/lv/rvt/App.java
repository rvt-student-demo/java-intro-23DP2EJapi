package lv.rvt;

import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;



public class App 
{
    public static void main( String[] args) throws  Exception 
    {
        BufferedReader reader = Utils.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();
        
        String line;
        int avr_age = 0;
        int dal = 0;
        line = reader.readLine();


        
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            
            
            Person person = new Person(
                parts[0], Integer.valueOf( parts[1]), Integer.valueOf( parts[2]), Integer.valueOf( parts[3])
                );
                persons.add(person);
                avr_age = avr_age + Integer.valueOf( parts[1]);
                dal = dal + 1;
                
                
            }
            
            
            for(Person i : persons) {
                System.out.println(i);
                
            }
            
            System.out.println("Average age of person:" + avr_age*1.0 / dal);
            
            
    }




}
