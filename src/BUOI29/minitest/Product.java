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

    public static void setTotal(double total) {
        Product.total = total;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrentcy(String currentcy) {
        this.currentcy = currentcy;
    }

    public static double getTotal() {
        return total;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getCurrentcy() {
        return currentcy;
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
