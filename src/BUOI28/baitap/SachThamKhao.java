package BUOI28.baitap;

import java.util.Scanner;

public class SachThamKhao {
    int codebook;
    String nameBook;
    String language;
    String producer;
    double price;
    int amount;
    boolean status;

    SachThamKhao() {

    }

    SachThamKhao(int codeBook, String nameBook, String language, String producer, double price, int amount) {
        this.codebook = codeBook;
        this.nameBook = nameBook;
        this.language = language;
        this.producer = producer;
        this.price = price;
        this.amount = amount;
        this.status = true;
    }

    public int getCodebook() {
        return codebook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getLanguage() {
        return language;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setCodebook(int codebook) {
        this.codebook = codebook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "codebook=" + codebook +
                ", nameBook='" + nameBook + '\'' +
                ", language='" + language + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }

    public double total() {

        if (status) {
            return this.price * this.amount + 10000;
        } else {
            return this.price * this.amount;
        }
    }
}

class QuanLySach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("codebook:");
        int codeBook = input.nextInt();
        input.nextLine();
        System.out.println("nameBook: ");
        String nameBook = input.nextLine();
        System.out.println("Language: ");
        String language = input.nextLine();
        System.out.println("producer: ");
        String producer = input.nextLine();
        System.out.println("price: ");
        double price = input.nextDouble();
        System.out.println("Amount: ");
        int amount = input.nextInt();
        boolean status = true;
        SachThamKhao sachThamKhao = new SachThamKhao(codeBook, nameBook, language, producer, price, amount);
        System.out.println(sachThamKhao.toString());
        System.out.println("Tổng giá trị sách: " + sachThamKhao.total());
    }
}
