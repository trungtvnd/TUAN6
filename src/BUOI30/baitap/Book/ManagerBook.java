package BUOI30.baitap.Book;

import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] bookList = new Book[13];
        ScienceBook book1 = new ScienceBook("Java Basic", 120000, 5, "24/03/2021", "IT");
        ScienceBook book2 = new ScienceBook("Python Basic", 50000, 10, "15/10/2021", "IT");
        NovelBook book3 = new NovelBook("Đồi gió hú", 80000, 2, "20/05/2021", "Emily Brontë");
        NovelBook book4 = new NovelBook("Harry Potter", 90000, 8, "03/05/2021", "J. K. Rowling");
        ScienceBook book5 = new ScienceBook("American Wild", 150000, 5, "24/03/2021", "Geography");
        NovelBook book6 = new NovelBook("Người Tù Khổ sai", 70000, 10, "09/08/2021", "Henri Charrière");
        ScienceBook book7 = new ScienceBook("Đắc Nhân Tâm", 150000, 8, "09/08/2021", "Skill");
        ScienceBook book8 = new ScienceBook("10 Vạn Câu Hỏi Vì Sao", 80000, 5, "09/05/2021", "Science");
        NovelBook book9 = new NovelBook("Bố Con Cá Gai", 70000, 2, "09/08/2021", "Cho Chang In");
        NovelBook book10 = new NovelBook("Người Đưa Diều", 50000, 4, "29/05/2021", "Khaled Hosseini");
        ScienceBook book11 = new ScienceBook("R language", 125000, 5, "08/05/2021", "IT");
        ScienceBook book12 = new ScienceBook("Địa Lý Đà Lạt", 50000, 5, "15/02/2021", "Geography");
        ScienceBook book13 = new ScienceBook("BigBang", 125000, 5, "08/05/2021", "Science");
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
        ScienceBook[] scienceBookList = new ScienceBook[8];
        scienceBookList[0] = book1;
        scienceBookList[1] = book2;
        scienceBookList[2] = book5;
        scienceBookList[3] = book7;
        scienceBookList[4] = book8;
        scienceBookList[5] = book11;
        scienceBookList[6] = book12;
        scienceBookList[7] = book13;
        NovelBook [] novelBookList = new NovelBook[5];
        novelBookList[0] = book3;
        novelBookList[1] = book4;
        novelBookList[2] = book6;
        novelBookList[3] = book9;
        novelBookList[4] = book10;


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to my Library");
            System.out.println("1. Create array of Books");
            System.out.println("2. Create array of three type books");
            System.out.println("3. Display all of Books");
            System.out.println("4. Total sum of Price ");
            System.out.println("5. Find the most expensive Book");
            System.out.println("6. Find the most Cheapest Book");
            System.out.println("7. Search Book follow type From Library");
            System.out.println("8. Search Book follow Author From Library");
            System.out.println("9. Average Price of Science Books");
            System.out.println("10. Show books in range price");
            System.out.println("0. Exit");
            System.out.println("Would you like to choose somethings");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    creatBookList();
                    break;
                case 2:
                    creatScienceBookList();
                    break;
                case 3://Từ case 3 làm theo mảng đã tạo sẵn bên trên để k phải nhập lại sách theo từng case//
                    //Trả luôn về từng loại sách khoa học và sách tiểu thuyết//
                    System.out.println("3. Display all of Books");
                    System.out.println("Sách khoa học là: ");
                    for (Book b : scienceBookList) {
                        System.out.println(b);
                    }
                    System.out.println("Sách tiểu thuyết là: ");
                    for (Book b : novelBookList) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println(Book.total + "VND");
                    break;
                case 5:
                    maxPrice(bookList);
                    break;
                case 6:
                    minPrice(bookList);
                    break;
                case 7:
                    findType(scienceBookList, scanner);
                    break;
                case 8:
                    findAuthor(novelBookList, scanner);
                    break;

                case 9:
                    System.out.println("9. Average Price of Science Books");
                    System.out.println("Đơn giá trung bình sách khoa hoc là: " + ScienceBook.totalScience / ScienceBook.totalAmount);
                    break;
                case 10:
                    rangePrice(bookList, scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static void findAuthor(NovelBook[] novelBookList, Scanner scanner) {
        System.out.println("Bạn muốn tìm tác giả nào: ");
        System.out.println("Điền tác giả bạn muốn tìm");
        scanner.nextLine();
        String author = scanner.nextLine();
        for (NovelBook novelBook: novelBookList) {
            if(author.equals(novelBook.getAuthor())){
                System.out.println("8. Search Book follow Author From Library");
                System.out.println(novelBook);
            }
        }
    }

    private static void findType(ScienceBook[] scienceBookList, Scanner scanner) {
        System.out.println("Bạn muốn tìm thể loại sách nào: ");
        System.out.println("Điền thể loại bạn muốn tìm");
        String type = scanner.next();
        for (ScienceBook sc : scienceBookList) {
            if (type.equals(sc.getType())) {
                System.out.println("7. Search Book follow type From Library");
                System.out.println(sc);
            }
        }
    }

    private static void minPrice(Book[] bookList) {
        double min = bookList[0].getPrice();
        for (Book book : bookList) {
            if (min < book.getPrice()) {
                min = book.getPrice();
                System.out.println("6. Find the most Cheapest Book");
                System.out.println("Sách có giá tiền nhỏ nhất là: ");
                System.out.println(book);
            }
        }
    }

    private static void maxPrice(Book[] bookList) {
        double max = bookList[0].getPrice();
        for (Book book : bookList) {
            if (max < book.getPrice()) {
                max = book.getPrice();
                System.out.println("5. Find the most expensive Book");
                System.out.println("Sách có giá tiền lớn nhất là: ");
                System.out.println(book);
            }
        }
    }

    private static void rangePrice(Book[] bookList, Scanner scanner) {
        double temp;
        System.out.println("Nhập khoảng giá: ");
        System.out.println("Price Start: ");
        scanner.nextLine();
        double priceStart = scanner.nextDouble();
        System.out.println("Price end: ");
        scanner.nextLine();
        double priceEnd = scanner.nextDouble();
        if(priceStart > priceEnd){
            temp = priceStart;
            priceStart = priceEnd;
            priceEnd = temp;
        }
        boolean flag = false;
        for (Book book: bookList) {
            if (book.getPrice() >= priceStart && book.getPrice() <= priceEnd){
                System.out.println("10. Show books in range price");
                System.out.println(book);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("10. Show books in range price");
            System.out.println("Not found");
        }
    }

    public static void creatBookList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng sách muốn nhập: ");
        int size = input.nextInt();
        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Nhập sách thứ " + (i + 1));
            books[i] = bookList(input);
        }
        for (Book b : books) {
            System.out.println(b);
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

    public static void creatScienceBookList() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng sách muốn nhập");
        int size1 = input.nextInt();
        Book[] books1 = new Book[size1];
        for (int i = 0; i < books1.length; i++) {
            System.out.println("Nhập sách thứ " + (i + 1));
            books1[i] = bookListScience(input);
        }
        for (Book b : books1) {
            System.out.println(b);
        }
    }

    public static Book bookListScience(Scanner input) {
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
        System.out.println("Nhập thể loại");
        String type = input.next();
        Book science = new ScienceBook(name, price, amount, day, type);
        return science;
    }
}
