package BUOI27.baitap;

import java.util.Scanner;

public class sumOfColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] array = {{1, 2, 3, 4, 5}, {4.7, 5.7, 5}, {2, 3, 5}};
        double sum = 0;
        System.out.println("Bạn muốn tính tổng của cột mấy");
        int column = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            int max = array[0].length;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length > column) {
                    max = array[i].length;
                }
                if (column < 0 || column > max) {
                    return;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i][column];
        }
        System.out.println(sum);
    }
}
