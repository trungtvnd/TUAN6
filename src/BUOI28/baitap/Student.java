package BUOI28.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double pointMath;
    private double pointLit;
    private double pointEng;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double pointMath, double pointLit, double pointEng) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pointMath = pointMath;
        this.pointLit = pointLit;
        this.pointEng = pointEng;
    }

    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointLit() {
        return pointLit;
    }

    public void setPointLit(double pointLit) {
        this.pointLit = pointLit;
    }

    public double getPointEng() {
        return pointEng;
    }

    public void setPointEng(double pointEng) {
        this.pointEng = pointEng;
    }

    public double averagePoint() {
        return (this.pointMath + this.pointLit + this.pointEng) / 3;
    }

    public String getAverage() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average='" + averagePoint() + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", pointMath=" + pointMath +
                ", pointLit=" + pointLit +
                ", pointEng=" + pointEng +
                '}';
    }

}
class StudentMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        Student student1 = new Student("A", 20, "Male", "HN");
        Student student2 = new Student("B", 20, "Female", "HN", 5, 6, 7);
        Student student3 = new Student("C", 20, "Male", "HN", 7, 8, 9);
//        Student student4 = createStudent(scanner);


        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
//        students[3] = student4;

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------");

        //thay đổi điểm
        inputPoints(scanner, student1);
        inputPoints(scanner, student2);

        //display array
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------");

//        //display name + ave
//        for (Student student : students) {
//            System.out.println(student.getAverage());
//        }
//        System.out.println("----------------");
//
//        //display name + ave tăng dần
//        for (int i = 0; i < students.length; i++) {
//            for (int j = 0; j < students.length; j++) {
//                if (students[j].averagePoint() > students[i].averagePoint()) {
//                    Student temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
//        for (Student student : students) {
//            System.out.println(student.getAverage());
//        }
    }

    public static void inputPoints(Scanner scanner, Student student) {
        if (student.getName().equals("A")) {
            System.out.println("Nhập điểm Toán: ");
            student.setPointMath(scanner.nextDouble());
            System.out.println("Nhập điểm Văn: ");
            student.setPointLit(scanner.nextDouble());
            System.out.println("Nhập điểm Anh: ");
            student.setPointEng(scanner.nextDouble());
        }
    }

    public static Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Văn: ");
        double lit = scanner.nextDouble();
        System.out.println("Nhập điểm Anh: ");
        double eng = scanner.nextDouble();
        return new Student(name, age, gender, address, math, lit, eng);
    }
    }

