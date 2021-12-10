package BUOI30.baitap.PointMove;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        point = new Point(3.4, 5);
        System.out.println(point);
        point.getXY();
        point.setXY(10, 10);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint = new MovablePoint(0,0, 5, 5);
//        System.out.println(movablePoint);
        movablePoint.MovablePoint();
        System.out.println(movablePoint);
    }
}
