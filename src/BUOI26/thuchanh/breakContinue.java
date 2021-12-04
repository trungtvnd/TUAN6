package BUOI26.thuchanh;

public class breakContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

//        while (number < 20) {
//            number++;
//            sum += number;
//            if (sum >= 90) {
//                break;
//            }
//        }
//        System.out.println("The number is: " + number);
//        System.out.println("The sum is: " + sum);
        while (number < 20) {
            number++;
            if (number == 5) {
                continue;
            }
            sum += number;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
