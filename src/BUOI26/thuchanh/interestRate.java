package BUOI26.thuchanh;

import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        double totalInterest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount of money: ");
        money = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter interest Rate: ");
        interestRate = input.nextDouble();
        totalInterest = money * month * interestRate / (100 * 12);
        System.out.printf("Số lãi nhận được là: %.2f VND" , totalInterest);

    }
}
