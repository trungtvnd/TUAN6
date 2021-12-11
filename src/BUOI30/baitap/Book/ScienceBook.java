package BUOI30.baitap.Book;

public class ScienceBook extends Book {
    public static double totalScience = 0;
    public static int totalAmount = 0;
    private String type;
    public ScienceBook(){

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public ScienceBook(String name, double price, int amount, String day, String type){
        super(name, price, amount, day);
        this.type = type;
        ScienceBook.totalScience += price * amount;
        ScienceBook.totalAmount+= amount;
 }

}
