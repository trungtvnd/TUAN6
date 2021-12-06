package BUOI27.thuchanh;

public class thamChieuMang {
    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[2]; // y represents an array of int values
        m(x, y); // Invoke m with arguments x and y
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[1]);
    }
    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 5555; // Assign a new value to numbers[0]
        numbers[1] = 2;
    }
}
