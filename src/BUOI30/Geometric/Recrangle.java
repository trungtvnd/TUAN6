package BUOI30.Geometric;

public class Recrangle extends Shape {
    private double width = 1;
    private double height = 1;

    public Recrangle(){

    }

    public Recrangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Recrangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return width * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }

    @Override
    public String toString() {
        return "Recrangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

