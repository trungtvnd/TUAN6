package BUOI27.thuchanh;

import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("enter the element of array");
            size = input.nextInt();
            if(size > 20){
                System.out.println("The size is not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter the element" + (i +1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "element in array: ", "");
        for (int element: array) {
            System.out.print(element+ "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size -1 - j];
            array[size -1 - j] = temp;
        }
        System.out.printf("%-20s%s", "reverse array: ", "");
        for (int element: array) {
            System.out.print(element + "\t" );
        }


    }
}
