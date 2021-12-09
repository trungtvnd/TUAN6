package BUOI30.Geometric;

public class Square extends Recrangle{
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    public void setWidth(double width){
        setSide(width);
    }
    public void setHeight(double height){
        setHeight(height);
    }
    @Override
    public String toString() {
        return "Square{}";
    }
}
