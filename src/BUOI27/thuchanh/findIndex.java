package BUOI27.thuchanh;

import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name's Student");
        String inputName = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("Position of the student is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not Found" + inputName + "in the list");
        }
    }
}
