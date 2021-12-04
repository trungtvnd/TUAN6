package BUOI26.baitap;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Would you like to choose something");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("***********");
                System.out.println("***********");
                System.out.println("***********");
                System.out.println("***********");
            } else if (choice == 2) {
                int choice1;
                System.out.print("Would you like to choose something");
                choice1 = input.nextInt();
                System.out.println("1. The corner is square at: top-left");
                System.out.println("2. The corner is square at: top-right");
                System.out.println("3. The corner is square at: botton-left");
                System.out.println("4. The corner is square at: botton-right");
                System.out.println("0. Exit");
                switch (choice1) {
                    case 3:
                        for (int i = 0; i <= 10; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    case 1:
                        for (int i = 0; i <= 10; i++) {
                            for (int j = 10; j >= i; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    case 2:
                        for (int i = 0; i <= 10; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 10; j >= i; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    case 4:
                        for (int i = 0; i <= 10; i++) {
                            for (int j = 10; j >= i; j--) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                }
            } else if (choice == 3) {
                for (int r = 0; r <= 9; r++) {
                    for (int sp = 9 - r + 1; sp >= 1; sp--) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= r; c++) {
                        System.out.print("*");
                    }
                    for (int c = r - 1; c >= 1; c--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
