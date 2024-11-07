package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int ievade = 0;
 
        Statistics statistics = new Statistics();
        /*statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());*/

        while(true){
            
            ievade = Integer.valueOf(scanner.nextLine());
            if (ievade == -1) {
                break;
                
            }
            statistics.addNumber(ievade);

        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.sumeven());
        System.out.println("Sum of ood numbers: " + statistics.sumodd());
    }




}
