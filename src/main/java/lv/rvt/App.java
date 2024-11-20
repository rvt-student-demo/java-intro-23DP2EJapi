package lv.rvt;

import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;



public class App 
{
    public static void main( String[] args) throws  Exception {
        ArrayList<Person> persons = PersonManager.getPersonsLists();
        for (Person person : persons){
            System.out.println(person);
        }
            
    }




}
