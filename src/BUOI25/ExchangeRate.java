package BUOI25;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd, exchange;
        exchange = 23000;
        System.out.println("Enter amount of USD: ");
        usd = scanner.nextDouble();
        vnd = usd * exchange;
        System.out.printf("VND is: %.2f", vnd);

    }
}
