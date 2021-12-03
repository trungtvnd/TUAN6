package BUOI25;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        String a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        a = scanner.nextLine();
        System.out.printf("Hello: %s", a);
    }
}
