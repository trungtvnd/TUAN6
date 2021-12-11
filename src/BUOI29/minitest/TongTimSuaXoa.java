package BUOI29.minitest;

import java.util.Scanner;
import java.util.Arrays;

public class TongTimSuaXoa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Product[] products = new Product[5];
        Product product0 = new Product(0, "Bike", 10000, "Mới", "USD");
        Product product1 = new Product(1, "Bicycle", 15000, "Cũ", "USD");
        Product product2 = new Product(2, "Toy", 10000, "Mới", "USD");
        Product product3 = new Product(3, "Toy", 10000, "Mới", "USD");
        Product product4 = new Product(4, "Toy", 10000, "Mới", "USD");

        products[0] = product0;
        products[1] = product1;
        products[2] = product2;
        products[3] = product3;
        products[4] = product4;
        for (Product product : products) {
            System.out.println(product);
        }

//        Tính tổng
//        System.out.println("Tổng giá là: " + Product.total);



//tìm sản phẩm theo ten và in ra thong tin san pham do
    System.out.println("Nhập tên sản phẩm muốn tìm");
    String findName = input.next();
    for (int i = 0; i < products.length; i++) {
        if(findName.equals(products[i].getName())){
            System.out.println(products[i]);
        }
    }





//        sưa sản phẩm    System.out.println("Bạn muốn sửa hang hóa nào");
////        System.out.println("Nhập mã hàng hóa muốn sửa");
////        int choice = input.nextInt();
////        for (int i = 0; i < products.length; i++) {
////                if(choice == i){
////                    System.out.println("Nhập thông tin muốn sửa");
////                    System.out.println("price: ");
////                    double price = input.nextDouble();
////                    input.nextLine();
////                    System.out.println("Name: ");
////                    String name = input.next();
////                    System.out.println("type: ");
////                    String type = input.nextLine();
////                    input.nextLine();
////                    System.out.println("Currency: ");
////                    String currency = input.next();
////                    products[i].setPrice(price);
////                    products[i].setName(name);
////                    products[i].setType(type);
////                    products[i].setCurrentcy(currency);
////                    System.out.println(products[i]);
////                    System.out.println(Product.total);
////                }
////
////        }
//


//        Xóa
        System.out.println("Nhập mã sản phẩm muốn xóa");
        int choice = input.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (choice == i){
                System.out.println("Tổng giá là: " + (Product.total - products[i].getPrice()));
                Product [] productList = new Product[products.length -1];
                for (int j = 0; j < choice; j++) {
                    productList[j] = products[j];
                }
                for (int j = choice +1; j < products.length; j++) {
                    productList[j -1] = products[j];
                }
                System.out.println(Arrays.toString(productList));

            }

        }
    }

}

