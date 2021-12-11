package BUOI30.baitap.demo;

public class AnimalMain {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal1 = cat; // Chuyển kiểu không tường minh
//        Animal animal2 = (Animal) cat; // Chuyển kiểu tường minh
//        cat.eat();
//        cat.meo();
//        animal1.eat();
//        animal2.eat();
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        ((Cat) animal).meo();
    }
}
