package BUOI30.baitap.Circle;

public class Circle {
    private double radius;
    private String color;
    public Circle(){}
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getPerimeter(){
        return Math.PI * this.radius * 2;
    }
    public String toString(){
        return "Radius: " + this.getRadius() + "Color: " + this.getColor();
    }
}
