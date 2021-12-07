package BUOI27.reviewbaitap;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Nhập số cần xóa");
        int element = input.nextInt();
        int index = checkIndex(array, element);
        if(index == -1){
            System.out.println("Số cần xóa không nằm trong mảng");
        }else {
            array = deleteElement(array, index);
        }
        System.out.println(Arrays.toString(array));
    }

    static int checkIndex(int[] array, int element){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(element == array[i]){
                index = i;
            }
        }
        return index;
    }
    static int[] deleteElement(int [] array, int index){
        int[] newArray = new int[array.length -1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];

        }
        for (int i = index+1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

    }