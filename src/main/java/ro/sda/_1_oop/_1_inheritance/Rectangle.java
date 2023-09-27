package ro.sda._1_oop._1_inheritance;

public class Rectangle {
    // instance variables / properties  / attributes/ fields / state of the class
    private double width;
    private double length;

    public Rectangle(double width, double length){
        /*
        if(width < 0){
        this.width = 0;
        }else}
        this.width = width
        }
         */

        this.width = width < 0 ? 0 : width;

        this.length = (length < 0) ? 0 : length;


    }
    //methods - behaviour of the class

    public double getLength(){
        return length;

    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width * length;

    }
}
