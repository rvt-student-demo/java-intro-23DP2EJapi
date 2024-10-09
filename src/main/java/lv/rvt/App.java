package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievada zvaigzņu skaitu");
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

        Stars.printTriangle(lielums);


    }





}
