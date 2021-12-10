package BUOI30.Geometric;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào thông tin của tam giác");
        System.out.println("Nhập cạnh 1");
        double side1 = input.nextDouble();
        System.out.println("Nhập cạnh 2 ");
        double side2 = input.nextDouble();
        System.out.println("Nhập cạnh 3");
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.println("Nhập màu sắc");
        String color = input.next();
        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);


    }
}
