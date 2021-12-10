package BUOI30.baitap.Book;

public class Book {
    private String name;
    private double price;
    private int amount;
    private String day;

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
}
