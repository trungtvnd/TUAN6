package BUOI26.thuchanh;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Drawing Triagle");
            System.out.println("2. Drawing Rectangle");
            System.out.println("3. Drawing Square");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("******");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    break;
                case 3:
                    System.out.println("*************");
                    System.out.println("*************");
                    System.out.println("*************");
                    System.out.println("*************");
                    System.out.println("*************");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No Choice");
            }

        }
    }
}
