package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Nhap mot phan tu muon xoa");
        int element = input.nextInt();
        int indexDelete = findIndex(array, element);
        if (indexDelete == -1) {
            System.out.println("Số cần xóa không nằm trong mảng");
        } else {
            array = deleteArray(array, indexDelete);
        }
        System.out.println(Arrays.toString(array));
    }

    static int findIndex(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index = i;
            }
        }
        return index;
    }

    static int[] deleteArray(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }
}
