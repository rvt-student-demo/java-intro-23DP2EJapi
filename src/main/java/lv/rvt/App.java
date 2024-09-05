package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Uzraksti savu vārdu:");
        String vards = scanner.nextLine();
        System.out.println("Uzraksti savu Uzvārdu:");
        String uzvards = scanner.nextLine();
        System.out.println("Uzraksti savu Grupu:");
        String grupa = scanner.nextLine();

        System.out.println("Jūs Uzrakstijāt: " + vards + " " + uzvards + " " + grupa);


    }

}
