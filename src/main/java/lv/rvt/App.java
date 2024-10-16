package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);
        //Jauns masīvs
        ArrayList<Integer> numuri = new ArrayList<>();
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
        System.out.println("2. un 3. elementa summa ir "+ (numuri.get(1) + numuri.get(2)));




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
