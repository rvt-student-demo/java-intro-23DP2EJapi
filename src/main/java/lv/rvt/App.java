package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet 1 skaitli");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2 skaitli");
        int otrais = Integer.valueOf(scanner.nextLine());
        System.out.println(pirmais + " + " + otrais + " = " + (pirmais +otrais));




    }

}
