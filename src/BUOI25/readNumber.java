package BUOI25;

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.printf("%d : Zero", number);
                break;
            case 1:
                System.out.printf("%d : One", number);
                break;
            case 2:
                System.out.printf("%d : Two", number);
                break;
            case 3:
                System.out.printf("%d : Three", number);
                break;
            case 4:
                System.out.printf("%d : Four", number);
                break;
            case 5:
                System.out.printf("%d : Five", number);
                break;
            case 6:
                System.out.printf("%d : Six", number);
                break;
            case 7:
                System.out.printf("%d : Seven", number);
                break;
            case 8:
                System.out.printf("%d : Eight", number);
                break;
            case 9:
                System.out.printf("%d : Nine", number);
                break;
//            default:
//                System.out.println("Out of Ability");
        }
        if (number >= 10 && number < 20) {
            int number1 = number - 10;
            switch (number1) {
                case 0:
                    System.out.printf("%d : Ten", number);
                    break;
                case 1:
                    System.out.printf("%d : Eleven", number);
                    break;
                case 2:
                    System.out.printf("%d : Twelve", number);
                    break;
                case 3:
                    System.out.printf("%d : Thirteen", number);
                    break;
                case 4:
                    System.out.printf("%d : Fourteen", number);
                    break;
                case 5:
                    System.out.printf("%d : Fifteen", number);
                    break;
                case 6:
                    System.out.printf("%d : Sixteen", number);
                    break;
                case 7:
                    System.out.printf("%d : Seventeen", number);
                    break;
                case 8:
                    System.out.printf("%d : Eighteen", number);
                    break;
                case 9:
                    System.out.printf("%d : Nineteen", number);
                    break;
//                default:
//                    System.out.println("Out of Ability");
//                    break;
            }
        }
        if (number >= 20 && number < 100) {
            double down, modulo, numChange;
            numChange = number;
            down = Math.round(numChange / 10);
            modulo = numChange % 10;
        }
    }
}
