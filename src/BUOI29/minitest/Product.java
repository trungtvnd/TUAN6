package BUOI29.minitest;

import java.util.Properties;

public class Product {
    public static double total = 0;
    private String codeProduct;
    private String name;
    private double price;
    private String type;
    private String currentcy = "USD";

    public Product(){}
    public Product(String codeProduct, String name, double price, String type, String currentcy){
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.type = type;
        this.currentcy = currentcy;
        Product.total += price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", currentcy='" + currentcy + '\'' +
                '}';
    }
}
