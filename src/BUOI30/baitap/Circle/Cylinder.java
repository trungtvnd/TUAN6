package BUOI30.baitap.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }


    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getRadiusCylinder(){
        return getRadius();
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getTotalAreaCylinder(){
        return getArea()* 2 + 2*this.height*getRadiusCylinder()*Math.PI;
    }
    public double getVolum(){
        return Math.PI * Math.pow(getRadiusCylinder(),2) * this.height;
    }

    public String toString(){
        return super.toString() + "height: " + getHeight() + "Area: " + getTotalAreaCylinder() + "Volum: " + getVolum();
    }


}
