package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array");
        size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + (i + 1) + "of array: ");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min of array: " + minArray(array));

    }
    static int minArray(int [] array){
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
