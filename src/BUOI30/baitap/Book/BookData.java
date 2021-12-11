package BUOI30.baitap.Book;

import java.util.Scanner;

public class BookData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book [] bookList = new Book[20];
        Book book1 = new Book("Java Basic", 120000, 15, "24/03/2021");
        Book book2 = new Book("Python Basic", 100000, 10, "15/10/2021");
        Book book3 = new Book("Đồi gió hú", 80000, 20, "20/05/2021");
        Book book4 = new Book("Harry Potter", 90000, 8, "03/05/2021");
        Book book5 = new Book("American Wild", 150000, 25, "24/03/2021");
        Book book6 = new Book("Người Tù Khổ sai", 70000, 15, "09/08/2021");
        Book book7 = new Book("Đắc Nhân Tâm", 100000, 8, "09/08/2021");
        Book book8 = new Book("10 Vạn Câu Hỏi Vì Sao", 80000, 15, "09/05/2021");
        Book book9 = new Book("Bố Con Cá Gai", 70000, 15, "09/08/2021");
        Book book10 = new Book("Người Đưa Diều", 50000, 15, "29/05/2021");
        Book book11 = new ScienceBook("R language", 125000, 5, "08/05/2021", "Sách CNTT");
        Book book12 = new ScienceBook("Địa Lý Đà Lạt", 50000, 5, "15/02/2021", "Sách Địa Lý");
        Book book13 = new ScienceBook("BigBang", 125000, 5, "08/05/2021", "Sách Khoa Học Vũ Trụ");
        bookList[0] = book1;
        bookList[1] = book2;
        bookList[2] = book3;
        bookList[3] = book4;
        bookList[4] = book5;
        bookList[5] = book6;
        bookList[6] = book7;
        bookList[7] = book8;
        bookList[8] = book9;
        bookList[9] = book10;
        bookList[10] = book11;
        bookList[11] = book12;
        bookList[12] = book13;
        for (Book b:bookList) {
            System.out.println(b);
        }


    }

}
