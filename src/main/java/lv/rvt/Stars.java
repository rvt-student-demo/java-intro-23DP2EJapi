package lv.rvt;

import java.util.*;

public class Stars {

    public static void printStars(int a) {

        for(int i = 0; i <a; i++){

        System.out.print("*");
        }
        System.out.println("");       
    }

    public static void printSquare(int size) {
        for (int b = 0; b < size; b++){
            System.out.println("");
            for (int c = 0; c < size; c++){
               System.out.print ("*");
            }
        }
        System.out.println("");
        
    }

    public static void printRectangle(int width, int height) {
        for (int b = 0; b < width; b++){
            System.out.println("");
            for (int c = 0; c < height; c++){
               System.out.print ("*");
            }
        }
        System.out.println("");
        
    }

    public static void printTriangle(int size) {
        for (int b = 0; b < size + 1; b++){
            System.out.println("");
            for (int c = 0; c < b; c++){
               System.out.print ("*");
            }
        }
        
    }
    
}
