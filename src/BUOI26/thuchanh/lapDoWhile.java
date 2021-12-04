package BUOI26.thuchanh;
import java.util.Scanner;
public class lapDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do{
            System.out.println("Enter a number");
            number = scanner.nextInt();
            sum += number;
        }while(number != 0);
        System.out.println("The sum is: " + sum);
    }
}
