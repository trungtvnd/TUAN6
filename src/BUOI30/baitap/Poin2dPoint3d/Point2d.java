package BUOI30.baitap.Poin2dPoint3d;

import java.awt.*;

public class Point2d {
    private float x = 0f;
    private float y = 0f;
    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] array(float[] array){
        array = new float[]{x, y};
        return array;
    }

    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
