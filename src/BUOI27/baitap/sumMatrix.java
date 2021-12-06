package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class sumMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("1. Yes");
        System.out.println("0. No");
        System.out.println("Bạn có muốn tính tổng các số trong đường chéo chính của một ma trận vuông không");
        choice = input.nextInt();
        while (true) {
            if (choice == 1) {
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
                double sum = 0;
                for (int i = 0; i < size; i++) {
                        sum += array[i][i];
                }
                System.out.println(sum);
            } else if (choice == 0) {
                break;
            }
        }


    }
}

