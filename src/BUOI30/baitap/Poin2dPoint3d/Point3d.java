package BUOI30.baitap.Poin2dPoint3d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getX(){
        return getX();
    }
    public float getY(){
        return getY();
    }

    public float getZ() {
        return z;
    }
    public void setSide(float sideX, float sizeY) {
        setX(sideX);
        setY(sizeY);
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Override
    public void setY(float y) {
        super.setY(y);
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] array (float[] array){
        array = new float[]{super.getX(), super.getY(), z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3d{" + "x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + "}";
    }
    }