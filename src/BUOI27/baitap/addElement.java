package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int index = 3;
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] newArr = new int[n + 1];
        int j = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = 7;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        newArr[index] = 7;

        System.out.println("Array after adding value: " + Arrays.toString(newArr));
    }

}
