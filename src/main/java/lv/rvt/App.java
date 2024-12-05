package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;



public class App 
{
    public static void main( String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String line;
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            
            
            Person person = new Person(
                parts[0], Integer.valueOf( parts[1]), Integer.valueOf( parts[2]), Integer.valueOf( parts[3])
                );
                persons.add(person);
                
            }

        boolean isRunning = true;
        System.out.println("Šī ir programma, kas veic darbības ar persons.csv failu.");

        while (isRunning) {
            System.out.println("Ievadiet komandu:");
            String command = scanner.nextLine();
           
            if(command.equals("help")){
                System.out.println("show: Izvada visas personas");
                System.out.println("add: pievieno personu");
                System.out.println("help: parāda visas komandas");
                System.out.println("exit: izbeidz programmu");

            } else if (command.equals("show")) {
                System.out.println(PersonManager.getPersonsLists());
                for(Person i : persons) {
                    System.out.println(i);
                    
                }
            } else if (command.equals("exit")){
                isRunning= false;
            } else if (command.equals("add")) {
                System.out.println("Ivadie personas Vārdu:");
                String name = scanner.nextLine();
                System.out.println("Ivadie personas vecumu:");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Ivadie personas augumu:");
                int weight = Integer.valueOf(scanner.nextLine());
                System.out.println("Ivadie personas svaru:");
                int height = Integer.valueOf(scanner.nextLine());
                Person person = new Person(name, age, weight, height);
                PersonManager.addPersons(person);
                persons.add(person);

            }
        }
        
        


    }

}
