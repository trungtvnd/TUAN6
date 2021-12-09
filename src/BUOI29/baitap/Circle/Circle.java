package BUOI29.baitap.Circle;

public class Circle {
    private double r;
    private String color = "red";
    Circle(){}

    public Circle(double r){
        this.r = r;
    }

    public double getr() {
        return r;
    }
    public  void setR(double r){
        this.r = r;
    }
   public double areaCircle(){
        return 3.14* r;
    }

}
