package BUOI27.baitap;

import java.util.Scanner;

public class elementOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        char character;
        System.out.println("Nhập ký tự cần tìm");
        character = input.next().charAt(0);
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + character +
                " trong chuỗi " + string + " = " + count);
    }
}
