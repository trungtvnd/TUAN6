package BUOI30.baitap.Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(5, "Yellow");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(10, 5, "blue");
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(5);
        System.out.println(cylinder2);
        System.out.println(cylinder1.getRadiusCylinder());
        cylinder1.setColor("yellow");

        cylinder1.setRadius(15);
        System.out.println(cylinder1);

    }
}
