package BUOI25;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if(bmi < 18){
            System.out.printf("%-20.2f%s", bmi, "underweight" );
        } else if( bmi < 25){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }else if(bmi < 30){
            System.out.printf("%-20.2f%s", bmi, "OverWeight");
        }else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }

    }
}
