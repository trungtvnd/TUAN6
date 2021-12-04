package BUOI26.thuchanh;
import java.util.Scanner;
public class lapWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int expextedValue = input.nextInt();
        while (number1 + number2 != expextedValue){
            System.out.println("Wrong answer");
            expextedValue = input.nextInt();
        }
        System.out.println("you got it");
    }

}
