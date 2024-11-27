package lv.rvt;

import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;



public class App 
{
    public static void main( String[] args){
        Counter skaitlis = new Counter(65);
        skaitlis.increase();
        skaitlis.decrease(15);
        System.out.println(skaitlis.value());
        skaitlis.increase(9);
        skaitlis.decrease();
        System.out.println(skaitlis.value());
            
    }

}
