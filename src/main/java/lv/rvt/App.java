package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;



public class App 
{
    public static void main( String[] args) throws Exception {
 
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  
        System.out.println(b);  
        System.out.println(c);  

        c = c.minus(a);    


        System.out.println(a);  
        System.out.println(b);  
        System.out.println(c);  

    }

}
