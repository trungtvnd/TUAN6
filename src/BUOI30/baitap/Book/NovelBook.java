package BUOI30.baitap.Book;

public class NovelBook extends  Book{
    private String author;
    public NovelBook (){}

    public NovelBook(String name, double price, int amount, String day, String author){
        super(name, price, amount, day);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
