package BUOI27.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class maxElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter the size");
            size = input.nextInt();
            if(size > 20){
                System.out.print("Size is not Exceed 20");
            }
        }while (size > 20);
        int[] asset = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("phan tu thu: " + (i+1));
            asset[i] = input.nextInt();
        }
        System.out.print("Properties list: ");
//        for(int element : asset){
//            System.out.print(element + "\t");
//
//        }
        System.out.println(Arrays.toString(asset));
        int max = asset[0];
        int index = 0;
        for (int i = 0; i < asset.length; i++) {
            if(max < asset[i]){
                max = asset[i];
                index = i;
            }
        }
        System.out.println("Tài sản lớn nhất là: " + max + "ở phần tử thứ: " + index);
    }
}
