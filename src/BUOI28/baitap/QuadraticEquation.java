package BUOI28.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getVariablea() {
        return this.a;
    }

    public double getVariableb() {
        return this.b;
    }

    public double getVariablec() {
        return this.c;
    }

    public double delta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b - Math.pow(this.delta(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b + Math.pow(this.delta(), 0.5)) / 2 * this.a;
    }

}


class Caculation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double numberA = input.nextDouble();
        double numberB = input.nextDouble();
        double numberC = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        if(quadraticEquation.delta() > 0){
            System.out.printf("Phương trình có 2 nghiệm là : %-10.2f %.2f", quadraticEquation.getRoot1() , quadraticEquation.getRoot2());
        }else if(quadraticEquation.delta() == 0){
            System.out.println("phương trình có 1 nghiệm kép là: " + quadraticEquation.getRoot2());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

}

