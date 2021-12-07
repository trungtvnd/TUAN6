package BUOI27.reviewbaitap;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kích thước của ma trận");
        int size = input.nextInt();
        double[][] array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Phần tử array[" + i + "]: phần tử thứ" + (j + 1) + " là: ");
                array[i][j] = input.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int number;
        int m = 0, n = 0;
        int[][] newArray = new int[size][size];
        System.out.println("Nhập vào giá trị muốn thêm vào");
        number = input.nextInt();

        System.out.println("Nhập vào vi trí muốn thêm phần tử");
        int index = input.nextInt();
        System.out.println("Nhập vào vi trí muốn thêm phần tử của phần tử");
        int index1 = input.nextInt();
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length + 1; j++) {
                if (i == index && j == index1) {
                    newArray[i][j] = number;
                } else {
                 newArray[i][j] = (int) array[i][n];
                 n++;


                }
            }
        }
        System.out.println(Arrays.deepToString(newArray));
    }

}

