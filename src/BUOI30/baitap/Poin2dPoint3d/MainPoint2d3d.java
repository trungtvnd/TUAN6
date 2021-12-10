package BUOI30.baitap.Poin2dPoint3d;

import java.util.Arrays;

public class MainPoint2d3d {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(0,0);

        point2d.setXY(3,4);
        System.out.println(point2d);
        Point2d point2d1 = new Point2d(10,10);
        System.out.println(point2d1.getX());;
        System.out.println(point2d1);
        System.out.println(Arrays.toString(point2d.array()));

        Point3d point3d = new Point3d(1,2,3);
        System.out.println(point3d);
        point3d.setXYZ(3,4,5);
        System.out.println(Arrays.toString(point3d.array()));


    }
}
