package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int summa = Integer.valueOf(scanner.nextLine());



        if ( summa < 5000 ) {
            System.out.println("No tax!");
        } else if (summa >= 5000 && summa < 25000) {
            System.out.println("Tax: " + (100 + (summa - 5000) * 0.08));
        } else if (summa >= 25000 && summa < 55000) {

            System.out.println("Tax: " + (1700 + (summa - 25000) * 0.1));
        } else if (summa >= 55000 && summa < 200000) {
 
            System.out.println("Tax: " + (4700 + (summa - 55000) * 0.12));
        } else if (summa >= 200000 && summa < 1000000) {

            System.out.println("Tax: " + (22100 + (summa - 200000) * 0.15));
        } else if (summa >= 1000000) {
            System.out.println("Tax: " + (142100 + (summa - 1000000) * 0.17));
        }

       /* System.out.println("Give points [0-100]:");

        int punkti = Integer.valueOf(scanner.nextLine());

        if (punkti < 0){
            System.out.println("Grade:impossible!");
        } else if (punkti >=0 && punkti < 50) {
            System.out.println("Grade:failed");
        } else if (punkti >=50 && punkti < 60) {
            System.out.println("Grade:1");
        } else if (punkti >=60 && punkti < 70) {
            System.out.println("Grade:2");
        } else if (punkti >=70 && punkti < 80) {
            System.out.println("Grade:3");
        } else if (punkti >=80 && punkti < 90) {
            System.out.println("Grade:4");
        } else if (punkti >=90 && punkti < 101) {
            System.out.println("Grade:5");
        } else if (punkti > 100) {
            System.out.println("Grade:incredible!");
        }*/


       /*  System.out.println("Ievadiet ātrumu:");

        int atrums = Integer.valueOf(scanner.nextLine());

        if (atrums > 120) {
           System.out.println("Soda nauda!");
        }*/

       /*  System.out.println("Ievadiet 1. skaitli");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2. skaitli");
        int otrais = Integer.valueOf(scanner.nextLine());
        System.out.println(pirmais + " + " + otrais + " = " + (pirmais + otrais));
        System.out.println(pirmais + " - " + otrais + " = " + (pirmais - otrais));
        System.out.println(pirmais + " * " + otrais + " = " + (pirmais * otrais));
        System.out.println(pirmais + " / " + otrais + " = " + ((double)pirmais / otrais));*/

        
        
        
        /*System.out.println("Ievadiet 1 skaitli");
        int pirmais = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet 2 skaitli");
        int otrais = Integer.valueOf(scanner.nextLine());
        System.out.println(pirmais + " + " + otrais + " = " + (pirmais + otrais));*/




    }

}
