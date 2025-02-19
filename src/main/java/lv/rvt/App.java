package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;



public class App 
{
    public static void main( String[] args) throws Exception {
        /*int[] intArr ={5, 4,3,7,6,2};
        //Parastā masīva printēšana
        System.out.println(Arrays.toString(intArr));
        //sakārto masīvu
        Arrays.sort(intArr);
        
        System.out.println(Arrays.toString(intArr));

        double[] doubleArr={2.5, 1.2, 6.8};

        System.out.println(Arrays.toString(doubleArr));

        Arrays.sort(intArr);

        System.out.println(Arrays.toString(doubleArr));

        String[] stringArr = {"ff", "cc", "dd", "fa"};

        System.out.println(Arrays.toString(stringArr));

        Arrays.sort(stringArr);

        System.out.println(Arrays.toString(stringArr));

        ArrayList<Person> personlist = new ArrayList<>();

        personlist.add(new Person("Pēteris", "Salaspils"));
        personlist.add(new Person("Jānis", "Sigūlda"));
        personlist.add(new Person("Niks", "Aizkraukle"));
        personlist.add(new Person("Jack", "Rīga"));
        personlist.add(new Person("Max", "Ikšķile"));

        for(Person person : personlist){
            System.out.println(person.getAdress());
        }
        System.out.println("================================================");
        //Sakārto pēc vārdiem alfabēta kārtībā
        personlist.sort(Comparator.comparing(Person::getAdress));
        //Pārbauda rezultātuspēc kārtošanas
        for(Person person : personlist){
            System.out.println(person.getAdress());
        }

        //Firtlēšana
        int[] intArr2 ={5, 4,3,7,6,2};*/

        /*for (int i : intArr2) {
            if(i < 5){
                //Veicam darbības ar elementiem kas mazāki par 5
                System.out.println(i);
            }

        }*/
        /*System.out.println("================================================");

        String[] stringArr2 = {"John", "Max", "Mike", "Leo", "Peter", "Ozols", "Ernests"};
        for (String value : stringArr2) {
            //Meklē ierakstītās frāzes
            if (value.contains("oh")) {
                System.out.println(value);
            }

            
        }*/
        //Regular expression

        //ANSI Escape Sequences

        String name = "Peteris";

        System.out.println("\033[0;33m");//Iestata krāsu uz dzeltanu
        System.out.println(name);


        System.out.println("\033[0;35m" + "Hello World");

        System.out.println(ConsoleColors.RESET);
        //Printē mazu zilu taisnstūri
        System.out.println("\033[44m" + " " + "\033[0m");
        for(int i = 0; i<30; i++){
            Thread.sleep(500);//aptur programmas izpildi uz milisekundēm
            System.out.print(ConsoleColors.RESET + ConsoleColors.BLUE_BACKGROUND + " " + ConsoleColors.RESET);

        }



    }


    /*public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }*/

}
