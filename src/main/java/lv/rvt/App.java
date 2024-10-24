package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Person ada = new Person("Ada");

        Person peteris = new Person("Pēteris");

        ada.printPerson();
        peteris.printPerson();

        Product prece = new Product("Piens", 3.86, 92);
        Product banans = new Product("Banāni", 2.12, 1548);
        prece.printProduct();
        banans.printProduct();


    }




}
