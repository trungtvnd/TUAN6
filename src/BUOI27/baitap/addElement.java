package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        int number;
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] newArr = new int[n + 1];
        int j = 0;
        System.out.println("Nhập vào giá trị muốn thêm vào");
        number = input.nextInt();

        System.out.println("Nhập vào vi trí muốn thêm phần tử");
        int index = input.nextInt();

        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after adding value: " + Arrays.toString(newArr));
    }

}
