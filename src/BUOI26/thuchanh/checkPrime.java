package BUOI26.thuchanh;
import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        int number;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if(number < 2){
            flag = false;
        }else {
            for (int i = 2; i <= Math.round(Math.sqrt(number)) ; i++) {
                if(number % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(number + "is a prime ");
        }else {
            System.out.println(number + "is not a prime");
        }
    }
}
