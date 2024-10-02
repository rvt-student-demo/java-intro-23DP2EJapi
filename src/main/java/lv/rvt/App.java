package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many times?");

        int i = Integer.valueOf(scanner.nextLine());

        for(int a = 0; a < i; a++ ){
            printText();

        }



     




    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        
    }

}
