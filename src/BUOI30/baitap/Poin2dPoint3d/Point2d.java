package BUOI30.baitap.Poin2dPoint3d;

import java.awt.*;

public class Point2d {
    private double x = 0;
    private double y = 0;
    public Point2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double[] array(){
        double[] array = new double[]{x, y};
        return array;
    }

    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
