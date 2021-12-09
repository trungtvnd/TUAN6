package BUOI29.minitest;

import java.util.Properties;
import java.util.Scanner;

public class ProductMain {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập số lượng sản phẩm");
//        int n = input.nextInt();
//        System.out.println("Nhập mã:");
//        String codeProduct = input.nextLine();
//        input.nextLine();
//        System.out.println("Nhap name");
//        String name = input.nextLine();
//        System.out.println("Nhập giá");
//        double price = input.nextDouble();
//        input.nextLine();
//        System.out.println("Nhập loại");
//        String type = input.nextLine();
//        System.out.println("Nhập loại tiền");
//        String currentcy = input.nextLine();
//
//        Product[] productList = new Product[n];
//        for (int i = 0; i < productList.length; i++) {
//            productList[i] = new Product(codeProduct, name, price, type, currentcy);
//        }
//        for (Product product: productList) {
//            System.out.println(product);
//        }
//
//    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Product[] products = new Product[3];
    Product product1 = new Product("abc123","Máy móc", 10000, "Mới", "USD" );
    Product product2 = new Product("abc12345","Máy Tiện", 15000, "Cũ", "USD" );
    Product product3 = new Product("abc123345","Máy Hàn", 10000, "Mới", "USD" );

    products[0] = product1;
    products[1] = product2;
    products[2] = product3;
    for (Product product:products) {
        System.out.println(product);

    }
}


}
