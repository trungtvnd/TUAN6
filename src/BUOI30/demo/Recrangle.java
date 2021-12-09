package BUOI30.demo;

public class Recrangle extends Geometric {
    private double width;
    private double height;


    public Recrangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Recrangle(String color, String filled, double width, double height){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
}

