package BUOI27.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class countPassStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int count = 0;

        do {
            System.out.println("Enter number point of Student");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Number of point does not exceed 30");
            }
        } while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("input element" + (i+1)+  "of array: ");
            array[i] = input.nextInt();
        }System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5){
                count++;
            }
        }
        System.out.println("number student pass" + count);
    }

}
