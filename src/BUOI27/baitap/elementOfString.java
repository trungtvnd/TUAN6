package BUOI27.baitap;

import java.util.Scanner;

public class elementOfString {
    public static void main(String[] args) {
        String string;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + string + " = " + count);
    }
}
