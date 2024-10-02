package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet numuru: ");

        int a = Integer.valueOf(scanner.nextLine());
        printUntilNumber(a);



    }

    public static void printUntilNumber(int skaits) {
        
        for (int a = 1; a <=skaits; a++)
        System.out.println(a);
        
        
    }

}
