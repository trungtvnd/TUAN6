package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class maxArray2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập kích thước width: ");
        int width = input.nextInt();
        System.out.println("Nhập kích thước height: ");
        int height = input.nextInt();
        double[][] array = new double[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Phần tử array[" + i + "]: phần tử thứ" + (j + 1) + " là: ");
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(array));
        double max = maxArray(array);
        System.out.println("max là: " + max);
    }

    static double maxArray(double[][] array) {
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
