package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ierakstie savu vārdu:");

        String vard = scanner.nextLine();

        System.out.println("Ierakstiet savu uzvārdu:");

        String uzvards = scanner.nextLine();

        System.out.println("Ierakstiet savu grupu:");

        String grupa = scanner.nextLine();

        System.out.println("Students:" + vard + " " + uzvards + ", " + grupa);


        /*String userInput = scanner.nextLine();

        System.out.println(userInput);*/
        /*String nname = "Janis";

        System.out.println("Hello " + nname + " Wellcome!");

        String start = "My name is ";
        String end = ", James Bond";

        System.out.println(start + "Bond" + end);

        System.out.println("Mani euro: " + 90 + 100);*/

    }

}
