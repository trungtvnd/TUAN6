package BUOI26.baitap;

import java.util.Scanner;

public class menu {
    public static void Rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width");
        int width = input.nextInt();
        System.out.println("Enter height");
        int height = input.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Triangle_TopLeft() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = height; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Triangle_Topright() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Triangle_BottomRight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Triangle_BottomLeft() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = height; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void isosceles_Triangle() {
        System.out.println("Enter height");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

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
                Rectangle();

            } else if (choice == 2) {
                int choice1;

                System.out.println("1. The corner is square at: top-left");
                System.out.println("2. The corner is square at: top-right");
                System.out.println("3. The corner is square at: botton-right");
                System.out.println("4. The corner is square at: botton-left");
                System.out.println("0. Exit");
                System.out.println("Would you like to choose something");
                choice1 = input.nextInt();

                switch (choice1) {
                    case 1:
                        Triangle_TopLeft();
                        break;
                    case 2:
                        Triangle_Topright();
                        break;
                    case 3:
                        Triangle_BottomRight();
                        break;
                    case 4:
                        Triangle_BottomLeft();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No Choice");
                }
            } else if (choice == 3) {
                isosceles_Triangle();
            }
            else if (choice == 4) {
                System.exit(0);
            }
        }
    }
}

