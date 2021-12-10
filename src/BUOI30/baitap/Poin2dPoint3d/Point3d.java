package BUOI30.baitap.Poin2dPoint3d;

public class Point3d extends Point2d {
    private double z = 0.0f;

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public double getX(){
        return getX();
    }
    public double getY(){
        return getY();
    }

    public double getZ() {
        return z;
    }
    public void setSide(double sideX, double sizeY) {
        setX(sideX);
        setY(sizeY);
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }
    public void setXYZ(double x, double y, double z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public double[] array (){
        double[] array = new double[]{super.getX(), super.getY(), z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3d{" + "x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + "}";
    }
    }