package ro.sda._1_oop._4_composition;

public class Dimensions {


    private double width;
    private double height;
    private double depth;

    public Dimensions(double width, double height, double depth){
        this.width = width;
        this.height= height;
        this.depth = depth;


    }

    public double getWidth() {
        return width; // this.width
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

}

