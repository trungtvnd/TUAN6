package BUOI30.baitap.PointMove;

public class MovablePoint extends Point {
    private double xSpeed = 0;
    private double ySpeed = 0;
    public MovablePoint(){}

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(double x, double y, double xSpeed, double ySpeed){
        super(xSpeed, ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed){

    }
    public double[] getSpeed(){
        double[] array = new double[]{xSpeed, ySpeed};
        return array;
    }
    public String toString(){
        return "MovablePoint{" + "x=" + getX() + ", y=" + getY() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
    }
    public MovablePoint MovablePoint(){
        double x1 = getX();
        double y1 = getY();
        x1 += xSpeed;
        y1 += ySpeed;
        return this;
    }
}
