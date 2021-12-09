package BUOI29.minitest;

import java.util.Scanner;

public class inputNProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm");
        int n = input.nextInt();

        Product[] productList = new Product[n];
        for (int i = 0; i < productList.length; i++) {
            System.out.println("Nhập mã:");
            int codeProduct = input.nextInt();
            System.out.println("Nhap name");
            String name = input.next();
            System.out.println("Nhập giá");
            double price = input.nextDouble();
            input.nextLine();
            System.out.println("Nhập loại");
            String type = input.next();
            System.out.println("Nhập loại tiền");
            String currentcy = input.next();
            productList[i] = new Product(codeProduct, name, price, type, currentcy);
        }
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("Tong gia là: " + Product.total);
    }


}
