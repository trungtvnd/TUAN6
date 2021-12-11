package BUOI30.baitap.Book;

import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng sách muốn nhập: ");
        int size = input.nextInt();
        Book[] books = new Book[size];
        creatBooklist(input, books);
        for (Book b:books) {
            System.out.println(b);
        }

    }

    public static void creatBooklist(Scanner input, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Nhập sách thứ " + (i + 1));
            books[i] = bookList(input);
        }
    }

    public static Book bookList(Scanner input) {
        System.out.println("Nhập Tên: ");
        String name = input.next();
        input.nextLine();
        System.out.println("Nhập Giá: ");
        double price = input.nextInt();
        input.nextLine();
        System.out.println("Nhập Khối lượng sách: ");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Nhập ngày nhập sách: ");
        String day = input.next();
        return new Book(name, price, amount, day);
    }
}
