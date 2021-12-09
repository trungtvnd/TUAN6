package BUOI29.baitap.Circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle(5);
        System.out.println(circle1.areaCircle());
        Circle circle2 = new Circle();
        circle2.setR(10);
        System.out.println(circle2.areaCircle());
    }
}
