package BUOI30.baitap.Book;

public class Book {
    public static double total = 0;
    private String name;
    private double price;
    private int amount;
    private String day;

    public Book(){}

    public Book(String name, double price, int amount, String day){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.day = day;
        Book.total += price * amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", day='" + day + '\'' +
                '}';
    }
}
