package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet sākuma numuru: ");

        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet beigu numuru: ");

        int stop = Integer.valueOf(scanner.nextLine());
        printUntilNumber(start, stop);



    }

    public static void printUntilNumber(int skaits, int sk) {
        int a = skaits;
        for (a = skaits;a <=sk; a++){

            if (a % 3 == 0) {
                
            

            System.out.println(a);
        }

        }

   
        
        
    }

}
