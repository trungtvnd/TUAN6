package BUOI28.baitap;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double pointMath;
    private double pointLiterature;
    private double pointEnglish;

    Student() {
    }

    Student(String name, int age, String gender, String address, double pointMath, double pointLiterature, double pointEnglish) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
        this.pointEnglish = pointEnglish;
    }

    public double pointAverage() {
        return (this.pointMath + this.pointLiterature + this.pointEnglish) / 3;
    }

    public String[] listStudent(){
        String age = String.valueOf(this.age);
        String pointMath = String.valueOf(this.pointMath);
        String pointLiterature = String.valueOf(this.pointLiterature);
        String pointEnglish = String.valueOf(this.pointEnglish);
        String[] listStudent = {this.name, age , this.gender, this.address, pointMath, pointLiterature, pointEnglish};
        return listStudent;
    }
}

class StudentShow{
    public static void main(String[] args) {
        Student student1 = new Student("Trung", 20, "nam", "Hà Nội", 10, 9, 8);
        System.out.println(Arrays.toString(student1.listStudent()));
        Student student2 = new Student("Huy", 20, "nam", "Hà Nội", 9.5, 8.5, 8);
        System.out.println(Arrays.toString(student2.listStudent()));
        Student student3 = new Student("Sang", 20, "nam", "Hà Nội", 7.5, 8, 10);
        System.out.println(Arrays.toString(student3.listStudent()));
    }

}
