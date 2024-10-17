package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cipar = random.nextInt(11)+1;
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
        System.out.println("Your score is " + punkti);


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























        /*System.out.println("ievada zvaigzņu skaitu");
        int a =Integer.valueOf(scanner.nextLine());

        Stars.printStars(a);

        System.out.println("ievada kvadrāta lielumu");

        int size = Integer.valueOf(scanner.nextLine());
        Stars.printSquare(size);

        System.out.println("Ievada taisnstūra garumu: ");
        int height = Integer.valueOf(scanner.nextLine());


        System.out.println("Ievada taisnstūra platumu ");

        int width = Integer.valueOf(scanner.nextLine());

        Stars.printRectangle(width, height);

        System.out.println("Ievadat trijstūra lielumu:");
        int lielums = Integer.valueOf(scanner.nextLine());

        Stars.printTriangle(lielums);*/

        /*System.out.println("ievada trijstūra lielumu:");

        int size = Integer.valueOf(scanner.nextLine());

        Stars.printRightTriangle(size);
        System.out.println();

        System.out.println("ievada Egles lielumu:");

        int izmers = Integer.valueOf(scanner.nextLine());

        Stars.christmasTree(izmers);*/



    }





}
