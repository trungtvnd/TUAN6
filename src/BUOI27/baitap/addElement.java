package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 6, 7, 8};
        int number, index;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        number = input.nextInt();
        System.out.println("Enter index");
        index = input.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            array = addElement(array, index, number);
        }
        System.out.println(Arrays.toString(array));
    }

    static int[] addElement(int[] array, int index, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length + 1; i++) {
            newArray[index] = number;
        }
        return newArray;
    }
}
