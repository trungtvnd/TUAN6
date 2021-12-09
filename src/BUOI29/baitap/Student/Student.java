package BUOI29.baitap.Student;

public class Student {
    public String name = "John";
    private String classes = "C02";

    Student(){}


     public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
