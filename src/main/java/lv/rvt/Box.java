package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    private double side;
    public Box box;

    public Box(double width, double height, double length){
     this.height = height;
     this.width = width;
     this.length = length;
     
    }
    public  Box( Box oldBox ){
        this.box = oldBox;

    }

    public double area(){

    return this.width * this.length;
    }
    public double volume(){
        return this.width * this.length * this.height;
    }
    private void faceArea(){
        double faceArea = this.height * this.length;
    }

    private void topArea(){
        double topArea = this.width * this.length;
    }

    private void sideArea(){
        double sideArea = this.height * this.width;
    }
    public double length(){
        return this.length;
    }
    
    public double height(){
        return this.height;
    }
    
    public double width(){
        return this.width;
    }
    public Box biggerBox( Box oldBox )
{

  return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
}
public boolean nests( Box outsideBox, Box insideBox){
    if (outsideBox.length() > insideBox.length() && outsideBox.height() > insideBox.height() && outsideBox.width() > insideBox.width() ){
        return true;
    }
    return false;
}

}
