package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);

        /*DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();*/
        
        /*Person ada = new Person("Ada");
        Person antti = new Person("Antti");

        ada.printPerson();
        antti.printPerson();
        System.out.println("");

        ada.growOlder();
        ada.growOlder();

        ada.printPerson();
        antti.printPerson();

        Product prece = new Product("Piens", 3.86, 92);
        Product banans = new Product("Banāni", 2.12, 1548);
        prece.printProduct();
        banans.printProduct();*/


    }




}
