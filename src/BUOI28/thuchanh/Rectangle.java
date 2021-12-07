package BUOI28.thuchanh;

import java.sql.ResultSet;
import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPrimiter(){
        return (this.width + this.height) *2 ;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ",height = " + height +"}";
    }

}

class MainRectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter height");
        double height = input.nextDouble();
        System.out.println("Enter width");
        double width = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle " + rectangle.display());
        System.out.println("Primeter of Rectangle is: " + rectangle.getPrimiter());
        System.out.println("Area of Rectangle is: " + rectangle.getArea());
    }
}
