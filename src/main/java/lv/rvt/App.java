package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 4 uzdevums
        int uzvaras = 0;
        int meginajumi = 3;
        int cipar = 0;
        int minejums = 0;

        for (int a = 0; a<10; a++){
        cipar = random.nextInt(10)+1;;
        System.out.println("I am thinking of a number from 1 to 10." );
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");
        
        while (meginajumi != 0) {
            minejums = Integer.valueOf(scanner.nextLine());
            if (minejums == cipar) {
                System.out.println("RIGHT!");
                uzvaras++;
                break;

            } else if(minejums> cipar  && minejums - cipar == 1 || minejums - cipar == -1){
                System.out.println("Hot");
                meginajumi--;


            } else if(minejums > cipar  && minejums - cipar == 2 || minejums - cipar == -2){
                System.out.println("Warm");
                meginajumi--;


            } else{
                System.out.println("Cold");
                meginajumi--;
            }
        
        }
        if (meginajumi == 0) {
            System.out.println("The correct number was " + cipar);
        }

        System.out.println("You have won " + uzvaras + "out of" + (a + 1) + "rounds");
        meginajumi = 3;

        }

        rank(uzvaras);







        // 3 b uzdevums
       /* int cipar = random.nextInt(11)+1;
        int punkti = 5;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("Try to guess the number.");
        System.out.println("Your beginning score is 5 points.");
        System.out.println("Each time you guess wrong, your score is decreased by one.");
        int minejums = 0;


        while(true){
            System.out.print("Enter a guess:");
            minejums = Integer.valueOf(scanner.nextLine());
            if (minejums == cipar) {
                System.out.println("You WON the game!");

                break;
            } else if (minejums < cipar) {
                punkti --;
                System.out.println("Too Low! Your score is now " + punkti);
                
                
            } else if (minejums > cipar) {
                punkti --;
                System.out.println("Too much! Your score is now " + punkti);
                
            }

            if (punkti == 0){
                System.out.println("You lost.");
                break;
            }

            
        }
        System.out.println("Your score is " + punkti);*/


        //Jauns masīvs
        /*ArrayList<Integer> numuri = new ArrayList<>();
        int summa = 0;

        while (true){
            System.out.println("Ievadiet skaitli");
            int a = Integer.valueOf(scanner.nextLine());
            if(a == 0){
                break;
            }
            numuri.add(a);
            summa = summa + a;
        }
        System.out.println("Visu elementu summa ir " + summa);
        System.out.println("2. un 3. elementa summa ir "+ (numuri.get(1) + numuri.get(2)));*/




      /*  ArrayList<String> strlist = new ArrayList<>();

        while (true) {
            System.out.println("Kāds ir vārds:");
            String vards = scanner.nextLine();
            if (vards.equals("")) {
                break;
                
            }
            strlist.add(vards);
            
            
        }
        System.out.println(strlist.get(2));*/

    }
    public static void rank(int uzvaras) {
        if (uzvaras == 10) {
            System.out.println("hackers");
            
        } else if (uzvaras == 9) {
            System.out.println("professionals");
        } else if (uzvaras == 8) {
            System.out.println("advanced");
        } else if (uzvaras == 7) {
            System.out.println("amateurs");
        } else {
            System.out.println("Don't have a rank");
        }
        
    }




}
