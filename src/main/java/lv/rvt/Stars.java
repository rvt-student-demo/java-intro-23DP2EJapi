package lv.rvt;

import java.util.*;

public class Stars {

    /*public static void printStars(int a) {

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
        
    }*/

    public static void printSpaces(int number) {
        for(int a =0; a < number; a++){
            System.out.print(" ");
        }
        
    }

    public static void printRightTriangle(int size) {
        for (int b = 0; b < size + 2; b++){
            System.out.println("");
            printSpaces(size - b);
            for (int c = 0; c < b; c++){
            
               System.out.print ("*");
            }
            if(b == size){
                break;
            }
        }

        
        
    }
    
    public static void christmasTree(int izmers) {
        for (int a = 1; a <= izmers; a++) {
            printSpaces(izmers - a);
            for (int k = 0; k < (2 * a - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int h = 0; h<2; h++){
        printSpaces(izmers -2);
        for(int mk =0; mk<3;mk++){
            System.out.print("*");
        }
        System.out.println();
    }
    
        
        
    }
}
